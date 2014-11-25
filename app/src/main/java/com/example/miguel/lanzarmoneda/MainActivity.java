package com.example.miguel.lanzarmoneda;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {
    final static String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Entra en onCreate");
    }

    public void onClick(View v) {
        int result = resultado();
        Log.i(TAG, "Vemos el resultado del Random" + result);
        if (result == 1) {
            Toast.makeText(this, R.string.cara, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, R.string.cruz, Toast.LENGTH_LONG).show();
        }
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

    public int resultado() {
        Random rnd = new Random();
        int randonNumber = rnd.nextInt(2);
        return randonNumber;
    }
}
