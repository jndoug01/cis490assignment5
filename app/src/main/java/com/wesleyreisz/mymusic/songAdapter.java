package com.wesleyreisz.mymusic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

/**
 * Created by Nathan on 10/19/2015.
 */
public class songAdapter extends ArrayAdapter {
    private Context mContext;
    private List<Song> mEntries;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    public songAdapter(Context context, int textViewResourceId, List<Song> entries) {
        super(context, textViewResourceId, entries);
        mContext = context;
        mEntries = entries;

    }
}
