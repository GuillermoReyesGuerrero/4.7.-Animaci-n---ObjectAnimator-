package com.example.guillermo.ejemploanimationevents;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RelativeLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        canvas = (RelativeLayout) findViewById(R.id.animationCanvas);

    }

    public void onButtonClick(View v) {

        float screenHeight = canvas.getHeight();
        float propertyStart= 0f;
        float propertyEnd = - (screenHeight - (float)imageView.getHeight());
        String propertyName="translationY";

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, propertyName,propertyStart,propertyEnd)
                .setDuration(2000);
        animator.setInterpolator(new BounceInterpolator());
        animator.setRepeatCount(1);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.start();
    }

    public void onButtonClick2(View v) {

        float screenHeight = canvas.getHeight();
        float propertyStart= 0f;
        float propertyEnd = - (screenHeight - (float)imageView.getHeight());
        String propertyName="translationY";

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, propertyName,propertyStart,propertyEnd)
                .setDuration(2000);
        animator.setInterpolator(new CycleInterpolator(2));
        animator.setRepeatCount(1);
        //animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.start();
    }

    public void onButtonClick3(View v) {

        float screenHeight = canvas.getHeight();
        float propertyStart= 0f;
        float propertyEnd = - (screenHeight - (float)imageView.getHeight());
        String propertyName="translationY";

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, propertyName,propertyStart,propertyEnd)
                .setDuration(2000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.setRepeatCount(1);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.start();
    }

    public void onButtonClick4(View v) {

        float screenHeight = canvas.getHeight();
        float propertyStart= 0f;
        float propertyEnd = - (screenHeight - (float)imageView.getHeight());
        String propertyName="translationY";

        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView, propertyName,propertyStart,propertyEnd)
                .setDuration(2000);
        animator.setInterpolator(new DecelerateInterpolator());
        animator.setRepeatCount(1);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.start();
    }


}
