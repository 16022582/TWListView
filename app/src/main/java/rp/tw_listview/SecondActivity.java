package rp.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Modules> modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ListView lv = findViewById(R.id.lvModules);
        TextView tv1 = findViewById(R.id.textViewMod);

        Intent in = getIntent();

        modules = new ArrayList<Modules>();

        modules.add(new Modules("C208", true));
        modules.add(new Modules("C200", false));
        modules.add(new Modules("C306", true));

        aa = new ModulesAdapter(this,R.layout.row,modules);
        lv.setAdapter(aa);

    }
}
