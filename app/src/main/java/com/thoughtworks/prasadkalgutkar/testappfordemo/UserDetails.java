package com.thoughtworks.prasadkalgutkar.testappfordemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class UserDetails extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        String username = getIntent().getStringExtra("USERNAME");
        setValueFor(username);
    }

    public void setValueFor(String username){
        TextView firstname = (TextView) findViewById(R.id.firstName);
        TextView lastname = (TextView) findViewById(R.id.lastName);
        TextView gender = (TextView) findViewById(R.id.gender);
        TextView emailid = (TextView) findViewById(R.id.emailId);

        if(username.toString().equals("Nikhil")){
            firstname.setText("Nikhil");
            lastname.setText("Jain");
            gender.setText("Male");
            emailid.setText("nikhilj@thoughtworks.com");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
