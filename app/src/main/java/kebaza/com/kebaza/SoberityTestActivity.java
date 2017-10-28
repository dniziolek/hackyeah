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

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soberity_test);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.soberButton)
    public void submitSober() {
        Intent intent = new Intent(SoberityTestActivity.this, KebabSettingsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.drunkButton)
    public void submitDrunk() {
        i++;
        checkIfDrunk(i);
    }

    private void checkIfDrunk(int checks){
        if(checks%3 == 0) {
            Intent intent= new Intent(SoberityTestActivity.this, KebabSettingsActivity.class);
            startActivity(intent);
        }
    }

}
