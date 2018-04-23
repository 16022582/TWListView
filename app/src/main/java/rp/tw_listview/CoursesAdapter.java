package rp.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CoursesAdapter extends ArrayAdapter<Courses> {

    private ArrayList<Courses> courses;
    private Context context;
    private TextView tvName;



    public CoursesAdapter(Context context, int resource,
                    ArrayList<Courses> objects){
        super(context, resource, objects);
        courses = objects;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvName = rowView.findViewById(R.id.textView2);
        Courses currentCourse = courses.get(position);

        tvName.setText(currentCourse.getYears());

        return rowView;
    }
}
