package org.wfp.fittest.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class RegistrationActivity extends AppCompatActivity {

    private Button button_save_user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        OnClickButtonListener();
    }
    public void OnClickButtonListener(){

        button_save_user = (Button) findViewById(R.id.user_submit);
        button_save_user.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent( "org.wfp.fittest.myfirstapp.DashboardActivity");
                        startActivity(intent);
                        Toast.makeText(RegistrationActivity.this, " User creation successful.", Toast.LENGTH_SHORT).show();
                    }
                }

        );
    }

}
