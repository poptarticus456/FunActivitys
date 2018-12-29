package org.poptarticus.FunActivitys.ColorBooks;

import android.graphics.Color;
import java.util.Random;

public class dadJokeColorWheel {

    // Member variable (properties about the object)
    private String[] mColors = {
            "#32CD32",
            "#228B22",
            "#008000",
            "#006400",
            "#20B2AA",
            "#008B8B",
            "#008080"


    };


    public int getColor() {

        String color;

        // Randomly select a Dad Jokes
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
