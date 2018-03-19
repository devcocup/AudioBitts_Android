package co.audiobitts.audiobitts;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Heltgolf on 3/19/2018.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId(getString(R.string.parse_app_id))
        .server(getString(R.string.parse_server_url))
        .build());
    }
}
