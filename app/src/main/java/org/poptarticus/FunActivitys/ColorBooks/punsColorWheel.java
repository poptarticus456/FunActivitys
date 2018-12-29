package org.poptarticus.FunActivitys.ColorBooks;

import android.graphics.Color;

import java.util.Random;

public class punsColorWheel {

    // Member variable (properties about the object)
    private String[] mColors = {
            "#FF9700",
            "#D57E00",
            "#FFA82A",
            "#FF8F1A",
            "#FF8200",
            "#D86E00",
            "#C96600",
            "#D05500",
            "#FB6701",
            "#FF7C22",
            "#FE1500",
            "#D11100",
            "#FF5242",
            "#BE281B",
            "#AD0E00",
            "#980C00",
            "#FC5800",
            "#DB4D00",
            "#FF0000",
            "#C20000",
            "#970000",
            "#B12C2C",
            "#851818",
            "#570707",
            "#520000",
    };

    // Method (abilities: things the object can do)
    public int getColor() {

        String color;

        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
