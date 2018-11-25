package com.example.sys.sharedp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intent_Activity extends AppCompatActivity {
 TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_intent_ );
        t=findViewById( R.id.textView );
        SharedPreferences sp=getSharedPreferences( "Student Data",MODE_PRIVATE );
         String s1=sp.getString( "NAME", "" );
         String s2=sp.getString( "COLLEGE", "" );
         String s3=sp.getString( "BRANCH","" );
         t.setText( s1+"\n"+s2+"\n"+s3 );

    }
}
