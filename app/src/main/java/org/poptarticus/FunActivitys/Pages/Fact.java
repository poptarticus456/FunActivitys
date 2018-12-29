package org.poptarticus.FunActivitys.Pages;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.poptarticus.FunActivitys.Books.factbook;
import org.poptarticus.FunActivitys.ColorBooks.factsColorWheel;
import org.poptarticus.FunActivitys.R;

import java.util.Random;

public class Fact extends Activity {
    public static final String TAG = Fact.class.getSimpleName();





    private AdView mAdView;

    private factbook mFactBook = new factbook();
    private factsColorWheel mFactsColorWheel = new factsColorWheel();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);


        final TextView FactLabel = (TextView) findViewById(R.id.FactTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.FactScreen);


// This sets the text view when you open the puns activity
        int randomIndexOpen = new Random().nextInt(mFactBook.mFact.length);
        String randomStringOpen = mFactBook.mFact[randomIndexOpen];

        FactLabel.setText(randomStringOpen);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // This sets the text view when the button is clicked
                int randomIndex = new Random().nextInt(mFactBook.mFact.length);
                String randomString = mFactBook.mFact[randomIndex];

                FactLabel.setText(randomString);


                int color = mFactsColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);


            }

        };
        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }

    public void ImageButton2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

