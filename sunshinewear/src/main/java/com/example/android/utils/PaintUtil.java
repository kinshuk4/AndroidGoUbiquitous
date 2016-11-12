package com.example.android.utils;


import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;

// Helper class to initialize paint objects
public class PaintUtil {
    public static final Typeface NORMAL_TYPEFACE =
            Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
    private PaintUtil(){

    }
    public static Paint createBgPaint(Resources resources, int textColor) {
        Paint paint = new Paint();
        paint.setColor(resources.getColor(textColor));//
        return paint;
    }

    public static Paint createTextPaint(Resources resources, int textColor, int dimension) {
        Paint paint = new Paint();
        if(textColor > 0){
            paint.setColor(resources.getColor(textColor));
        }
        paint.setTypeface(NORMAL_TYPEFACE);
        paint.setAntiAlias(true);
        if(dimension > 0){
            paint.setTextSize(resources.getDimension(dimension));
        }
        return paint;
    }
}
