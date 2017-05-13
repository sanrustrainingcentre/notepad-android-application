package ca.sanrus.notepad;

import android.app.Application;
import android.util.Log;

/**
 * Created by santhoshgutta on 2017-05-07.
 */
public class NotepadApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("NotepadApplication", "NotepadApplication::onCreate() is called");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d("NotepadApplication", "NotepadApplication::onTerminate() is called");
    }
}
