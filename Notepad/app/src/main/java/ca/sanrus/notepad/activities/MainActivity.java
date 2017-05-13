package ca.sanrus.notepad.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import ca.sanrus.notepad.R;

/**
 * Created by santhoshgutta on 2017-05-07.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_layout);
    }
}
