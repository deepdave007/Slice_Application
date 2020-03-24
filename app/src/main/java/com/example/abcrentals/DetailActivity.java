package com.example.abcrentals;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Provides UI for the Detail page with Collapsing Toolbar.
 */
public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";
    private FirebaseFirestore db;
    private InterestsClass interest;
    private Searches search;

    public ViewFlipper flipper;
    public ViewFlipper flipper2;

    //this code is used to show the place on selecting it
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        if (intent.hasExtra("interest")) {
            interest = (InterestsClass) getIntent().getSerializableExtra("interest");
            db = FirebaseFirestore.getInstance();

            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            // Set Collapsing Toolbar layout to the screen
            CollapsingToolbarLayout collapsingToolbar =
                    (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
            // Set title of Detail page
            collapsingToolbar.setTitle(interest.getName());

            TextView placeDetail = (TextView) findViewById(R.id.place_detail);
            placeDetail.setText(interest.getDescription());


            TextView placeLocation = (TextView) findViewById(R.id.place_location);
            placeLocation.setText(interest.getAddress());

            Button number = (Button) findViewById(R.id.calluser);
            number.setText(interest.getContactNumber());

            number.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: " + interest.getContactNumber()));
                    startActivity(intent);
                }
            });

            flipper = findViewById(R.id.flipper);
            String[] listofurls = interest.getImageUri().split(";");

            for (int i = 0; i < listofurls.length; i++) {
                flipperImages(listofurls[i]);
            }

        } else {
            search = (Searches) getIntent().getSerializableExtra("search");
            db = FirebaseFirestore.getInstance();

            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            // Set Collapsing Toolbar layout to the screen
            CollapsingToolbarLayout collapsingToolbar =
                    (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
            // Set title of Detail page
            collapsingToolbar.setTitle(search.getname());

            TextView placeDetail = (TextView) findViewById(R.id.place_detail);
            placeDetail.setText(search.getdescription());

            TextView placeLocation = (TextView) findViewById(R.id.place_location);
            placeLocation.setText(search.getlocation());

            TextView rooms = (TextView) findViewById(R.id.nutrition);
            rooms.setText(search.getnutrition());

            Button number = (Button) findViewById(R.id.calluser);
            number.setText(search.getcontactNumber());


            number.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: " + search.getcontactNumber()));
                    startActivity(intent);
                }
            });

            flipper = findViewById(R.id.flipper);
            String[] listofurls = search.getimage().split(";");

            for (int i = 0; i < listofurls.length; i++) {
                flipperImages(listofurls[i]);
            }

        }


    }

    public void flipperImages(String imgurl) {
        ImageView imgview = new ImageView(this);
        imgview.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.get().load(imgurl).into(imgview);

        flipper.addView(imgview);
        flipper.setFlipInterval(5000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }
}