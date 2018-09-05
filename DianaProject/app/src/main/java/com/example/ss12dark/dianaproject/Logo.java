package com.example.ss12dark.dianaproject;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_logo);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_logo);

        appear();

    }

    public void appear(){
        final ImageView s1 = (ImageView) findViewById(R.id.cap);
        ViewPropertyAnimator viewPropertyAnimator = s1.animate().alpha(1f).setDuration(2000);
        viewPropertyAnimator.setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                ViewPropertyAnimator viewPropertyAnimator2 =s1.animate().alpha(0f).setDuration(2000);
                viewPropertyAnimator2.setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        come();
                    }
                });
            }
        });
    }
    public void come(){
        Intent next = new Intent(this,MainSearch.class);
        startActivity(next);
        finish();
    }
}

