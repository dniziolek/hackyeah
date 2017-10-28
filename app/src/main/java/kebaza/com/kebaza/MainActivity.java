package kebaza.com.kebaza;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animateSplash();
    }

    private void animateSplash() {
        RelativeLayout splashScreenView = findViewById(R.id.layout_splash_screen);
        ImageView logoView = findViewById(R.id.image_ss_logo);
        final TextView sloganView = findViewById(R.id.text_ss_slogan);

        performAnimation(splashScreenView, R.anim.splash_layout_alpha);
        performAnimation(logoView, R.anim.splash_logo_translate);
        sloganView.setVisibility(View.INVISIBLE);

        final Handler handler = new Handler();
        animateSloganFadingAfterDelay(handler, sloganView);
        showNextActivityAfterDelay(handler);
    }

    private void animateSloganFadingAfterDelay(Handler handler, final TextView slogan) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                performAnimation(slogan, R.anim.splash_slogan_alpha);
                slogan.setVisibility(View.VISIBLE);
            }
        }, getResources().getInteger(R.integer.splash_slogan_start_alpha_after));
    }

    private void showNextActivityAfterDelay(Handler handler) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SoberityTestActivity.class);
                startActivity(intent);
                finish();
            }
        }, getResources().getInteger(R.integer.splash_finish_after));
    }

    private void performAnimation(View view, int animId) {
        Animation anim = AnimationUtils.loadAnimation(this, animId);
        anim.reset();
        view.clearAnimation();
        view.startAnimation(anim);
    }
}
