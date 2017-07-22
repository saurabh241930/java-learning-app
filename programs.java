package com.javaBasic.basicConcepts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class programs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> Contents = new ArrayList<String>();
        Contents.add("ADD TWO NO.(USER DEFINED INPUT)");
        Contents.add("FIBONACCI SERIES");
        Contents.add("PRIME NUMBER");
        Contents.add("PALINDROME NUMBER");
        Contents.add("FACTORIAL NUMBER");
        Contents.add("ARMSTRONG NUMBER");
        Contents.add("IF ELSE PROGRAM");
        Contents.add("SWITCH CASE PROGRAM");
        Contents.add("BUBBLE SORT");
        Contents.add("SELECTION SORT");
        Contents.add("INSERTION SORT");
        Contents.add("PROGRAM ON STRING BUFFER");
        Contents.add("FIND LENGTH OF STRING");
        Contents.add("REVERSE A STRING");
        Contents.add("PROGRAM ON 2 DIMENSION ARRAY");
        Contents.add("PROGRAM ON 3 DIMENSION ARRAY");
        Contents.add("PASS AN ARGUMENT INTO ARRAY");
        Contents.add("PROGRAM ON MAPS ");
        Contents.add("PROGRAM ON MULTI-THREADING ");
        Contents.add("PROGRAM ON EXCEPTION HANDLING");
        Contents.add("PROGRAM ON VECTOR(ARRAYLIST) ");
        Contents.add("PROGRAM ON ABSTRACT CLASS ");
        Contents.add("PROGRAM ON CONSTRUCTOR OVERLOADING ");
        Contents.add("PROGRAM ON LINEAR SEARCH ");
        Contents.add("PROGRAM ON CALCULATOR ");





        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Contents);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), vectoradvanceprogram.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), matrixoperations.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), palindrome.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), factorial.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), armstrong.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), programtopassarray.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), reversestring.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(getApplicationContext(), pstringbuffer.class);
                        startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(getApplicationContext(), pstringbuffer.class);
                        startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 17:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 18:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 19:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 21:
                        intent = new Intent(getApplicationContext(), string.class);
                        startActivity(intent);
                        break;
                    case 22:
                        intent = new Intent(getApplicationContext(), vectoradvanceprogram.class);
                        startActivity(intent);
                        break;
                    case 23:
                        intent = new Intent(getApplicationContext(), bubblesorting.class);
                        startActivity(intent);
                        break;


                    default:
                }
            }

        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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




   /*@Override
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
*/