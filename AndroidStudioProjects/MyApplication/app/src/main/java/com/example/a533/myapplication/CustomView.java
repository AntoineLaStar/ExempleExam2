package com.example.a533.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View implements OnSuccessPasswordListener{

    String password = "0101";
    Paint paint = null;

    public CustomView(Context context) {
        super(context);
    }

    @Override
    public void onSucessPassword() {

    }


    @Override
    protected void onDraw(Canvas canvas)
    {
        paint = new Paint();
        super.onDraw(canvas);
        int x = getWidth();
        int y = getHeight();
        int radius;
        radius = 70;
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPaint(paint);
        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("black"));
        canvas.drawCircle(100, 100, radius, paint);
        canvas.drawCircle(  275, 100, radius, paint);
        canvas.drawCircle(  450, 100, radius, paint);
        canvas.drawCircle(  625, 100, radius, paint);

    }

    public void setInput(String input){

    }

    public void setOnSucessPasswordListener(){

    }
}
