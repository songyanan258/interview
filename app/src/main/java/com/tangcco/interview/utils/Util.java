package com.tangcco.interview.utils;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by YN on 2017/3/19.
 */

public class Util {

    public static void mToast (Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }

    //SnackBar通知框

    public static void mSnack(final Context context,CoordinatorLayout coordinatorLayout,String message,
                              String action,final String tost){
        Snackbar.make(coordinatorLayout,message,Snackbar.LENGTH_LONG)
                .setAction(action, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,tost,Toast.LENGTH_LONG).show();
                    }
                }).show();

    }
}
