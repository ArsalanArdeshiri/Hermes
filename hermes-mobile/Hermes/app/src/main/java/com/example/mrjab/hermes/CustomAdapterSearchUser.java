package com.example.mrjab.hermes;

/**
 * Created by yatharth on 25/02/17.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapterSearchUser extends BaseAdapter {
    ArrayList<String> usrnames;
    Context context;
    int [] imageId;
    ArrayList<String> names;
    ArrayList<String> userID;
    private static LayoutInflater inflater=null;
    public CustomAdapterSearchUser(SearchForUser sfs, ArrayList<String> username, int[] profImages, ArrayList<String> name, ArrayList<String> userIDs) {
        // TODO Auto-generated constructor stub
        usrnames=username;
        context=sfs;
        imageId=profImages;
        names=name;
        userID=userIDs;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return usrnames.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv1;
        TextView tv2;
        TextView tv3;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.search_for_user_row, null);
        holder.tv1=(TextView) rowView.findViewById(R.id.textView1);
        holder.tv2=(TextView) rowView.findViewById(R.id.textView2);
        holder.tv3=(TextView) rowView.findViewById(R.id.textView3);

        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);


        holder.tv1.setText(usrnames.get(position));
        holder.tv2.setText("User ID : "+userID.get(position));
        holder.tv3.setText(names.get(position));
        //holder.tv2.setText(times[position]);
        //holder.tv3.setText(messages[position]);
        //holder.img.setImageResource(imageId[position]);
        /*rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+usrnames[position], Toast.LENGTH_LONG).show();
            }
        });*/
        return rowView;
    }


}