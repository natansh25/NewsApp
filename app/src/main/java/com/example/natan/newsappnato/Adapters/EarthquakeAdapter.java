package com.example.natan.newsappnato.Adapters;

/**
 * Created by natan on 8/16/2017.
 */

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.natan.newsappnato.R;
import com.squareup.picasso.Picasso;

import java.util.List;



/**
 * An {@link EarthquakeAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Earthquake} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    //Context context;

    /**
     * The part of the location string from the USGS service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */

    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.customlayout, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView TitleView = (TextView) listItemView.findViewById(R.id.txt_title);
        // Format the magnitude to show 1 decimal place
        // Display the magnitude of the current earthquake in that TextView
        TitleView.setText( currentEarthquake.getTitle());

        TextView DesView = (TextView) listItemView.findViewById(R.id.txt_dec);
        DesView.setMovementMethod(new ScrollingMovementMethod());
        DesView.setText(currentEarthquake.getDes());



        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);

        //Picasso.with(context.load(currentEarthquake.getImageResourceId()).into(imageView);
        Picasso.with(getContext()).load(currentEarthquake.getImage()).into(imageView);

        //imageView.setImageResource(currentEarthquake.getImageResourceId());



        return listItemView;
    }
}