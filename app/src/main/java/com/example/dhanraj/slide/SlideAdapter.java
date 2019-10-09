package com.example.dhanraj.slide;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Dhanraj on 26-03-2018.
 */

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;


    public int[] my_images = {

            R.drawable.rooom2,
            R.drawable.rooom3,
            R.drawable.rooom4,
            R.drawable.rooom5

    };


    public String[] my_title = {

            "ROOM1",
            "ROOM2",
            "ROOM3",
            "ROOM4"

    };

    public String[] my_description = {

            "Description1",
            "Description2",
            "Description3",
            "Description4"

    };

    public int[] my_colours = {

            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,181,212)
    };

    public SlideAdapter(Context context){

        this.context=context;

    }

    @Override
    public int getCount() {
        return my_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout = view.findViewById(R.id.slidelayout);
        ImageView imageView = (ImageView)view.findViewById(R.id.slideimg);
        TextView textView = (TextView)view.findViewById(R.id.txt);
        TextView des = (TextView)view.findViewById(R.id.text_description);
        linearLayout.setBackgroundColor(my_colours[position]);
        imageView.setImageResource(my_images[position]);
        textView.setText(my_title[position]);
        des.setText(my_description[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    container.removeView((LinearLayout)object);
    }
}
