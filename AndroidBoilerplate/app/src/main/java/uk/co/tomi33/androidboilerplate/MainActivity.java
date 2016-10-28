package uk.co.tomi33.androidboilerplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.tomi33.androidboilerplate.Activity.AuthActivity;

public class MainActivity extends AppCompatActivity {

    private Button mAuthIntentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuthIntentButton = (Button) findViewById(R.id.auth_activity_intent_button);

        mAuthIntentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AuthActivity.class);
                startActivity(i);
            }
        });

    }
}
