package com.example.ivan.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ivan on 26.04.17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
