package kebaza.com.kebaza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SoberityTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soberity_test);
        ButterKnife.bind(this);

        startActivity(new Intent(this, KebabSettingsActivity.class));


    }

    @OnClick(R.id.soberButton)
    public void submit() {
        Toast.makeText(this, "message test", Toast.LENGTH_LONG).show();
    }
}
