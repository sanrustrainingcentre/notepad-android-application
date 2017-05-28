package ca.sanrus.notepad.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by sanrustrainingcentre on 2017-05-28.
 */

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("DashboardActivity", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DashboardActivity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DashboardActivity", "onResume()");


        //intent came from Activity A (or) delivered to Activity B
        Intent incomingIntent = getIntent();

        Bundle args = incomingIntent.getExtras();

        String firstName = args.getString("FIRST_NAME_KEY");
        String lastName = args.getString("LAST_NAME_KEY");

        //intent to be sent for Activity A
        Intent resultIntent = new Intent();
        resultIntent.putExtra("RESULT_KEY", "Server sent success message");

        int resultCode = 30;
        setResult(resultCode, resultIntent);

        Toast.makeText(getApplicationContext(), "First Name = [" + firstName + "], Last Name = [" + lastName + "]", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DashboardActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DashboardActivity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DashboardActivity", "onDestroy()");
    }
}
