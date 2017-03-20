package com.tangcco.interview.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by YN on 2017/3/19.
 */

public class Util {

    public static void mToast (Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }
}
