package com.bignerdranch.android.criminalintentii;

import android.support.v4.app.Fragment;

/**
 * Created by macowner on 3/6/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
