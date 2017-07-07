package edu.austincc.AppAbilities;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

/**
 * Created by ariannaharadon on 3/29/17.
 */

public class CustomView extends View {
        public ShapeDrawable mDrawable;


        public CustomView(Context context) {
            super(context);


            int x = 50;
            int y = 30;
            int width = 300;
            int height = 400;

            mDrawable = new ShapeDrawable(new OvalShape());
            mDrawable.setBounds(x, y, x + width, y + height);
        }

        protected void onDraw(Canvas canvas) {
            mDrawable.draw(canvas);
        }
    }

