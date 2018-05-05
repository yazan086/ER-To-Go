package com.er_to_go;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class ActivityLogin extends AppCompatActivity {

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */


    // UI references.
    private EditText mUserName, mPasswordView;
    private View mProgressView;
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mUserName = (EditText) findViewById(R.id.txtUserName);
        mPasswordView = (EditText) findViewById(R.id.txtPassword);


        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = mUserName.getText().toString();
                String pass = mUserName.getText().toString();
                if(Username.equalsIgnoreCase("doc1") && pass.equalsIgnoreCase("doc112345")){
                    Intent MainIntent = new Intent(ActivityLogin.this, RoomsAndPatientsQueue.class);
                    startActivity(MainIntent);
                    Toast.makeText(ActivityLogin.this, "successfully logged in!", Toast.LENGTH_LONG).show();
                }else if (Username.equalsIgnoreCase("doc2") && pass.equalsIgnoreCase("doc212345")){
                    Intent MainIntent = new Intent(ActivityLogin.this, RoomsAndPatientsQueue.class);
                    startActivity(MainIntent);
                    Toast.makeText(ActivityLogin.this, "successfully logged in!", Toast.LENGTH_LONG).show();
                }else if (Username.equalsIgnoreCase("doc3") && pass.equalsIgnoreCase("doc312345")){
                    Intent MainIntent = new Intent(ActivityLogin.this, RoomsAndPatientsQueue.class);
                    startActivity(MainIntent);
                    Toast.makeText(ActivityLogin.this, "successfully logged in!", Toast.LENGTH_LONG).show();
                }else if (Username.equalsIgnoreCase("doc4") && pass.equalsIgnoreCase("doc412345")){
                    Intent MainIntent = new Intent(ActivityLogin.this, RoomsAndPatientsQueue.class);
                    startActivity(MainIntent);
                    Toast.makeText(ActivityLogin.this, "successfully logged in!", Toast.LENGTH_LONG).show();
                }else if (Username.equalsIgnoreCase("doc5") && pass.equalsIgnoreCase("doc512345")){
                    Intent MainIntent = new Intent(ActivityLogin.this, RoomsAndPatientsQueue.class);
                    startActivity(MainIntent);
                    Toast.makeText(ActivityLogin.this, "successfully logged in!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ActivityLogin.this, "Username or password are incorrect, Try again!", Toast.LENGTH_LONG).show();
                }


            }
        });

        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
    }


}

