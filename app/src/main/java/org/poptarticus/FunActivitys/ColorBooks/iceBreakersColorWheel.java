package org.poptarticus.FunActivitys.ColorBooks;

/**
 * Created by aaron on 1/1/2018.
 */


import android.graphics.Color;

import java.util.Random;

public class iceBreakersColorWheel {

    // Member variable (properties about the object)
    private String[] mColors = {
            "#CB5252",
            "#FC1414",
            "#D30000",
            "#A40000",
            "#FF340C",
            "#E12C08",
            "#AF3D26",
            "#F63C00",
            "#E13B05",
            "#900000",
            "#A01515",
            "#AE2828",
            "#8E1919",
            "#C23838",
            "#DC2E2E",
            "#FD2C2C",
            "#DB0000",
            "#BD0303",
            "#FF003E",
            "#D00033",
            "#FF4573",
            "#DE2C58",
            "#AD2244",
            "#91213C",
            "#B6002C",
    };

    // Method (abilities: things the object can do)
    public int getColor() {

        String color;

        // Randomly select a Dad Joke
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}

