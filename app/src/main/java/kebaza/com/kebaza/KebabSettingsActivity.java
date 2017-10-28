package kebaza.com.kebaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class KebabSettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebab_settings);

        Button orderBigKebab = findViewById(R.id.duzyKebab);
        orderBigKebab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderBigKebab();
            }
        });

        Button orderVeryBigKebab = findViewById(R.id.bardzoDuzyKebab);
        orderVeryBigKebab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderVeryBigKebab();
            }
        });
    }

    private void orderBigKebab() {
        goToNavigation(false);
    }

    private void orderVeryBigKebab() {
        goToNavigation(true);
    }

    private void goToNavigation(boolean isVeryBig){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE, isVeryBig);
        startActivity(intent);
    }
}

