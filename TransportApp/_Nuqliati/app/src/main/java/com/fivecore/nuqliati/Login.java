package com.fivecore.nuqliati;

import android.app.Activity;
import android.app.Application;
import android.app.DownloadManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support

public class Login extends Activity {

    public static int SPLASH_OUT_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

      //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        TextView forgot_pass = (TextView) findViewById(R.id.forgot_pass);
        forgot_pass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        TextView signUpText = findViewById(R.id.sign_up_text);
        signUpText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(getBaseContext(),survey.class);
                startActivity(i);
                finish();
            }
        });
    }

}
