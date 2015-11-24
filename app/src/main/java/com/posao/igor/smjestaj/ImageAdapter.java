package com.posao.igor.smjestaj;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by igor on 24.11.2015..
 */
public class ImageAdapter extends BaseAdapter {

    private Context context;
    private int itemBackground;
    private String[] imageStrs;

    public ImageAdapter(Context c, String[] imageStrs)
    {
        context = c;
        this.imageStrs = imageStrs;
        // sets a grey background; wraps around the images
        TypedArray a = this.context.obtainStyledAttributes(R.styleable.MyGallery);
        itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
        a.recycle();
    }

    @Override
    public int getCount() {
        return imageStrs.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);

        Picasso.with(context)
                .load(imageStrs[position])
                .noFade()
                .fit()
                .into(imageView);
        imageView.setLayoutParams(new Gallery.LayoutParams(300, 300));
        imageView.setBackgroundResource(itemBackground);
        return imageView;
    }
}
