package org.wfp.fittest.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button fab = (Button) findViewById(R.id.submit_forgot);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
               // Intent intent = new Intent( "org.wfp.fittest.myfirstapp.LoginActivity");
                //startActivity(intent);
                Toast.makeText(ForgotPasswordActivity.this, "Email sent with the login instructions.", Toast.LENGTH_SHORT).show();

                finish();

            }
        });

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v){
                        finish();
                    }
                }

        );
    }

}
