package com.example.tharani.actionbarmenu;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*onCreate is the first method in the life cycle of an activity
  savedInstance passes data to super class,data is pull to store state of application
  * setContentView is used to set layout for the activity
  *R is a resource and it is auto generate file
   * activity_main assign an integer value*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Creating onCreateOptionsMenu method().
     * In this method, you can inflate your menu resource into the Menu provided in the callback.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater() method will Inflate a menu hierarchy from the specified XML resource.
        getMenuInflater().inflate(R.menu.toast_menu, menu);
        return true;
    }

    /**
     * Creating onOptionsItemSelected() method.
     * This method passes the MenuItem selected.
     * You can identify the item by calling getItemId() method,
     which returns the unique ID for the menu item .
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem color) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (color.getItemId()) { // Creating Switch Case for item selection from the menu

            // Giving Toast message to each item in the menu by its item ID .
            case R.id.comp:
                Toast.makeText(getApplicationContext(), "You have clicked Computer",
                        Toast.LENGTH_LONG).show();
                //getApplicationContext() : Returns the context for the entire application
                return true;
            case R.id.pad:
                Toast.makeText(getApplicationContext(), "You have clicked Gamepad",
                        Toast.LENGTH_LONG).show();
                // LENGTH_LONG The duration for which a toast is displayed on screen and duration which is 3,5 seconds
                return true;
            case R.id.cam:
                Toast.makeText(getApplicationContext(), "You have clicked Camera",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.video:
                Toast.makeText(getApplicationContext(),"You have clicked Video",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.mail:
                Toast.makeText(getApplicationContext(),"You have clicked EMail",
                        Toast.LENGTH_LONG).show();
                return true;
            default:
                return true;
        }
    }
}

