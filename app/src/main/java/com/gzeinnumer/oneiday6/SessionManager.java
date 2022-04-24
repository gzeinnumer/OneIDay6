package com.gzeinnumer.oneiday6;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    private String PREF_NAME = "SIMPAN";
    private String KEY_USERNAME = "username";

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public SessionManager(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public void setUsername(String id) {
        mEditor = mSharedPreferences.edit();
        mEditor.putString(KEY_USERNAME, id).apply();
    }

    public String getUsername() {
        return mSharedPreferences.getString(KEY_USERNAME, null);
    }

    public void logout() {
        mEditor = mSharedPreferences.edit();
        mEditor.clear().commit();
    }
}
