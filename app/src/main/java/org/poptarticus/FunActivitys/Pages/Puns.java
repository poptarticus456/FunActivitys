package org.poptarticus.FunActivitys.Pages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.poptarticus.FunActivitys.Books.punBook;
import org.poptarticus.FunActivitys.ColorBooks.punsColorWheel;
import org.poptarticus.FunActivitys.R;

import java.util.Random;

public class Puns extends Activity {


    public static final String TAG = Puns.class.getSimpleName();

    private AdView mAdView;

    private punBook mPunBook = new punBook();
    private punsColorWheel mPunsColorWheel = new punsColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puns);

        final TextView PunLabel = (TextView) findViewById(R.id.punTextView);
        final Button showPunButton = (Button) findViewById(R.id.showPunButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.PunsScreen);


        // This sets the text view when you open the puns activity
        int randomIndexOpen = new Random().nextInt(mPunBook.mPuns.length);
        final String randomString = mPunBook.mPuns[randomIndexOpen];

        PunLabel.setText(randomString);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // This sets the text view when the button is clicked
                int randomIndex = new Random().nextInt(mPunBook.mPuns.length);
                String randomString = mPunBook.mPuns[randomIndex];

                PunLabel.setText(randomString);


                int color = mPunsColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showPunButton.setTextColor(color);


            }

        };
        showPunButton.setOnClickListener(listener);
    }

    public void imageButton1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}