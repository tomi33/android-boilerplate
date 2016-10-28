package uk.co.tomi33.androidboilerplate.Factory;

import android.util.Log;

public class Auth {
    private static final String TAG = Auth.class.getSimpleName();

    public static void CreateUserAuth(String identifier, String password) {
        Log.d(TAG, "Sign up triggered for user auth" + identifier);
    }

    public static void AuthenticateUser(String identifier, String password) {
        Log.d(TAG, "Log in triggered for user auth" + identifier);
    }
}
