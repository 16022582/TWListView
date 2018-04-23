package rp.tw_listview;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;


public class CoursesAdapter extends ArrayAdapter<Courses> {
    Context parent_content;
    int layout_id;
    ArrayList<Courses> aList;


    public CoursesAdapter(Context context, int resource,
                    ArrayList<Courses> objects){
        super(context, resource, objects);

        parent_content = context;
        layout_id = resource;
        aList = objects;

    }
}
