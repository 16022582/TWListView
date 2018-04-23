package rp.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModulesAdapter extends ArrayAdapter<Modules> {
    private ArrayList<Modules> modules;
    private Context context;
    private TextView tvName;
    private ImageView ivDay;

    public ModulesAdapter(Context context, int resource,
                          ArrayList<Modules> objects){
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row2, parent, false);

        tvName = rowView.findViewById(R.id.textViewMod);
        ivDay = (ImageView) rowView.findViewById(R.id.imageViewPic);
        Modules currentModule = modules.get(position);

        if(currentModule.isDay()) {
            ivDay.setImageResource(R.drawable.day1);
        }
        else {
            ivDay.setImageResource(R.drawable.day2);
        }

        return rowView;
    }
}
