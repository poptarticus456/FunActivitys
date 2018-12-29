package org.poptarticus.FunActivitys.Pages;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.analytics.FirebaseAnalytics;

import org.poptarticus.FunActivitys.R;


public class MainActivity extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    //Backbutton message and timer
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "Highjack.otf");
        TextView myTextView = (TextView) findViewById(R.id.MenuText);
        myTextView.setTypeface(myTypeFace);


        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

    }

    public void Punsgo(View view) {
        Intent intent = new Intent(this, Puns.class);
        startActivity(intent);
    }

    public void IceBreakersgo(View view) {
        Intent intent = new Intent(this, Icebreaker.class);
        startActivity(intent);
    }

    public void FunFactsgo(View view) {
        Intent intent = new Intent(this, Fact.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }


}
