package com.production.qtickets.utils;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Harsh on 9/8/2017.
 */

public class TextviewRegular extends TextView {

    public TextviewRegular(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat-Light.ttf"));

    }


}