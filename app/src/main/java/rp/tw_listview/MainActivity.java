package rp.tw_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        final ArrayList<Courses> newList;
        CoursesAdapter caToDo;

        newList = new ArrayList<Courses>();

        caToDo = new CoursesAdapter(this, R.layout.activity_main, newList);

        listView.setAdapter(caToDo);


        final Courses item1 = new Courses("Year 1");
        newList.add(item1);

        final Courses item2 = new Courses("Year 2");
        newList.add(item1);

        final Courses item3 = new Courses("Year 3");
        newList.add(item1);
    }
}
