package uk.co.tomi33.androidboilerplate.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.co.tomi33.androidboilerplate.Factory.Auth;
import uk.co.tomi33.androidboilerplate.R;

public class AuthActivity extends AppCompatActivity {

    private Button mLogInButton;
    private Button mSignUpButton;

    private EditText mSignUpAuthIdentifier;
    private EditText mLogInAuthIdentifier;
    private EditText mLogInPassword;
    private EditText mSignUpPassword;

    private LinearLayout mLoginLayout;
    private LinearLayout mSignupLayout;

    private TextView mSignUpLink;
    private TextView mLogInLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        mLogInButton = (Button) findViewById(R.id.log_in_button);
        mSignUpButton = (Button) findViewById(R.id.sign_up_button);

        mSignUpAuthIdentifier = (EditText) findViewById(R.id.sign_up_auth_identifier);
        mLogInAuthIdentifier = (EditText) findViewById(R.id.log_in_auth_identifier);
        mSignUpPassword = (EditText) findViewById(R.id.sign_up_auth_password);
        mLogInPassword = (EditText) findViewById(R.id.log_in_auth_password);

        mLoginLayout = (LinearLayout) findViewById(R.id.log_in_view);
        mSignupLayout = (LinearLayout) findViewById(R.id.sign_up_view);

        mSignUpLink = (TextView) findViewById(R.id.sign_up_link);
        mLogInLink = (TextView) findViewById(R.id.log_in_link);

        mLoginLayout.setVisibility(View.VISIBLE);

        mLogInLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSignupLayout.setVisibility(View.GONE);
                mLoginLayout.setVisibility(View.VISIBLE);
            }
        });

        mSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginLayout.setVisibility(View.GONE);
                mSignupLayout.setVisibility(View.VISIBLE);
            }
        });

        mLogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String identifier = mLogInAuthIdentifier.getText().toString();
                String password = mLogInPassword.getText().toString();

                Auth.AuthenticateUser(identifier, password);
            }
        });

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String identifier = mSignUpAuthIdentifier.getText().toString();
                String password = mSignUpPassword.getText().toString();

                Auth.CreateUserAuth(identifier, password);
            }
        });

    }
}
