package marinaaaniram.homework1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class ListAtivity extends ActionBarActivity {

    private StringNumbers stringNumbers = new StringNumbers();
    private int listSize = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ativity);

        MainActivity.getInstance().finish();

        String[] text1000 = new String[listSize];
        Integer[] image1000 = new Integer[listSize];

        for (int i = 1; i <= listSize; ++i) {
            text1000[i - 1] = stringNumbers.convertToString(i);
            image1000[i - 1] = R.drawable.ic_launcher;
        }

        CustomListAdapter customListAdapter = new CustomListAdapter(this, image1000, text1000);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customListAdapter);
    }
}
