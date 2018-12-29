package org.poptarticus.punsAd.ColorBooks;

/**
 * Created by aaron on 1/1/2018.
 */

import android.graphics.Color;

import java.util.Random;

public class factsColorWheel {

    // Member variable (properties about the object)
    private String[] mColors = {
            "#B60086",
            "#FD04BC",
            "#E01BAD",
            "#CD26A2",
            "#B43E96",
            "#AB22AD",
            "#8A0D8C",
            "#B819BA",
            "#FC00FF",
            "#F822FB",
            "#CA0FCD",
            "#EB23EF",
            "#D23FD5",
            "#AE45B0",
            "#9D00F9",
            "#770EB5",
            "#8D10D6",
            "#5F0D8F",
            "#851CC2",
            "#FF00DB",
            "#FF3BE3",
            "#BB00A1",
            "#D452C2",
            "#FF4AE6",
            "#FC33E1",
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

