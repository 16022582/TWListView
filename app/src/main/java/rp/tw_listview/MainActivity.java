package rp.tw_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Courses> courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.listView);

        courses = new ArrayList<Courses>();

        courses.add(new Courses("Year 1"));
        courses.add(new Courses("Year 2"));
        courses.add(new Courses("Year 3"));

        aa = new CoursesAdapter(this,R.layout.row,courses);
        lv.setAdapter(aa);
    }
}
