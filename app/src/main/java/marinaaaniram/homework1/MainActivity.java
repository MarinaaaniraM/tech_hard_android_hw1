package marinaaaniram.homework1;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.TimeUnit;


public class MainActivity extends Activity {

    static MainActivity mainActivity;
    private TimerAsyncTask timerAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerAsyncTask = new TimerAsyncTask();
        timerAsyncTask.execute();
    }

    @Override
    public void onPause() {
        super.onPause();

        timerAsyncTask.cancel(true);

    }

    public static MainActivity getInstance() {
        return mainActivity;
    }

    class TimerAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            Intent intent = new Intent(MainActivity.this, ListAtivity.class);
            startActivity(intent);
            finish();
        }
    }

}
