package com.javaBasic.basicConcepts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class experimental extends ActionBarActivity {
    EditText input1;
    EditText input2;
    EditText input3;
    EditText input4;
    EditText input5;
    ImageView display;


    public void check(View view) {
        if ((input1.getText().toString().equals("int x,int y")
           &&((input2.getText().toString().equals("x+y"))))
           &&(input3.getText().toString().equals("+c"))
            &&(input4.getText().toString().equals(("add a=new add();")))
            &&(input5.getText().toString().equals("a.add")))
        {

           display.setImageResource(R.drawable.welldone);
        }
        else {
           display.setImageResource(R.drawable.tryagain);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experimental);
         input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        input3 = (EditText) findViewById(R.id.input3);
        input4 = (EditText) findViewById(R.id.input4);
        input5 = (EditText) findViewById(R.id.input5);
        display = (ImageView) findViewById(R.id.display);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_experimental, menu);
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
