package kebaza.com.kebaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SoberityTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soberity_test);

        startActivity(new Intent(this, KebabSettingsActivity.class));
    }
}
