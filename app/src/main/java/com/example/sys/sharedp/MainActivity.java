package com.example.sys.sharedp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        e1=findViewById( R.id.et1 );
        e2=findViewById( R.id.et2 );
        e3=findViewById( R.id.et3 );
        b=findViewById( R.id.btn );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           String s1=e1.getText().toString().trim();
           String s2= e2.getText().toString().trim();
           String s3=e3.getText().toString().trim();
                if (s1.length()==0)
                    e1.setError( "Please enter a Name" );
                if(s2.length()==0)
                    e2.setError( "Please enter a College name" );
                if (s3.length()==0)
                    e3.setError( "Please enter a Branch name" );
                Intent i=new Intent( MainActivity.this,Intent_Activity.class );
                SharedPreferences.Editor shared=getSharedPreferences( "Student Data",MODE_PRIVATE ).edit();
                shared.putString( "NAME",s1 );
                shared.putString( "COLLEGE",s2 );
                shared.putString( "BRANCH",s3 );
                shared.apply();
                startActivity( i );

            }

        } );

    }
}
