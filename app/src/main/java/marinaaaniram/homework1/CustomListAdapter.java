package marinaaaniram.homework1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] text;
    private final Integer[] image;

    public CustomListAdapter(Activity context, Integer[] image, String[] text) {
        super(context, R.layout.text_with_image_item, text);

        this.context = context;
        this.text = text;
        this.image = image;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView;

        if (position % 2 == 0) {
            rowView = inflater.inflate(R.layout.text_with_image_item, null, true);
        } else {
            rowView = inflater.inflate(R.layout.text_with_image_item_dark, null, true);
        }

        TextView textView = (TextView) rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(text[position]);
        imageView.setImageResource(image[position]);

        return rowView;
    };
}
