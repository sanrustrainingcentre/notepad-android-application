package ca.sanrus.notepad.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import ca.sanrus.notepad.R;

/**
 * Created by santhoshgutta on 2017-05-07.
 */

public class SplashActivity extends Activity {

    private int requestCode = 10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Explicit Intent launching the dashboard activity
        //Intent dashBoardLaunchIntent = new Intent(this, DashboardActivity.class);
        //startActivity(dashBoardLaunchIntent);

        //implicit intent
        Intent dashboardLaunchImplicitIntent = new Intent("ca.sanrus.internals.dashboard_screen");
        dashboardLaunchImplicitIntent.putExtra("FIRST_NAME_KEY", "First");

        Bundle myKeyValuePairs = new Bundle();
        myKeyValuePairs.putString("FIRST_NAME_KEY", "First1");
        myKeyValuePairs.putString("LAST_NAME_KEY", "Last");

        Bundle myKeyValuePairs1 = new Bundle();
        myKeyValuePairs1.putString("FIRST_NAME_KEY", "First2");

        dashboardLaunchImplicitIntent.putExtras(myKeyValuePairs);
        dashboardLaunchImplicitIntent.putExtras(myKeyValuePairs1);

        if(dashboardLaunchImplicitIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(dashboardLaunchImplicitIntent);

            startActivityForResult(dashboardLaunchImplicitIntent, requestCode);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 10) {
            if (data != null) {
                String message = data.getStringExtra("RESULT_KEY");
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }
    }
}
