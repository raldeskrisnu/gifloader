package com.id.ralds.gifloader;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class gifLoader {

    Activity activity;
    Dialog dialog;

    public gifLoader(Activity activity) {
        this.activity = activity;
    }

    public void showPreloader(int themeDialog, int layout, int gifImageview, int gifDrawable){
        dialog  = new Dialog(activity, themeDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(layout);

        ImageView gifImageView = dialog.findViewById(gifImageview);

        Glide.with(activity)
                .load(gifDrawable)
                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
                .into(gifImageView);

        dialog.show();
    }

    public void hidePreloader(){
        dialog.dismiss();
    }
}
