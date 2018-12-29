package org.poptarticus.punsAd.Pages;

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

import org.poptarticus.punsAd.Books.iceBreakerbook;
import org.poptarticus.punsAd.ColorBooks.iceBreakersColorWheel;
import org.poptarticus.punsAd.R;

import java.util.Random;

public class Icebreaker extends Activity {
    public static final String TAG = Puns.class.getSimpleName();


    private AdView mAdView;

    private iceBreakerbook mIcebreakerBook = new iceBreakerbook();
    private iceBreakersColorWheel mIcebreakersColorWheel = new iceBreakersColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icebreakers);

        final TextView IcebreakerLabel = (TextView) findViewById(R.id.IcebreakerTextView);
        final Button showIcebreakerButton = (Button) findViewById(R.id.showIcebreakerButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.IceBreakerScreen);

        // This sets the text view when you open the puns activity
        int randomIndexOpen = new Random().nextInt(mIcebreakerBook.mIcebreaker.length);
        String randomString = mIcebreakerBook.mIcebreaker[randomIndexOpen];

        IcebreakerLabel.setText(randomString);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // This sets the text view when the button is clicked
                int randomIndex = new Random().nextInt(mIcebreakerBook.mIcebreaker.length);
                String randomString = mIcebreakerBook.mIcebreaker[randomIndex];

                IcebreakerLabel.setText(randomString);


                int color = mIcebreakersColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showIcebreakerButton.setTextColor(color);

            }

        };
        showIcebreakerButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }

    public void ImageButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

