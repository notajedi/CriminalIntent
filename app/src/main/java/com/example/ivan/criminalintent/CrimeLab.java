package com.example.ivan.criminalintent;

import android.content.Context;

/**
 * Created by ivan on 26.04.17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){}
}
