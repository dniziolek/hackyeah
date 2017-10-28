package kebaza.com.kebaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class KebabSettingsActivity extends AppCompatActivity {
    private BestKebebFinder finder = new BestKebebFinder();


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

        goToNavigation(finder.findBestKebab(Size.medium));
    }

    private void orderVeryBigKebab() {

        KebabPlace place = finder.findBestKebab(Size.big);
        goToNavigation(place);
    }

    private void goToNavigation(KebabPlace kebab){
        Bundle bundle = new Bundle();
        bundle.putSerializable(KebabPlace.alias, kebab);
        //bundle.putFloat("a", 1.5f);
        Intent intent = new Intent(KebabSettingsActivity.this, MapsActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}

