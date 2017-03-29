package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Button;

import java.util.Date;

/**
 * Created by Avinash.Ganga on 10/03/17.
 */

public class DatePickerActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_DATE = "com.example.androidnerdranch.criminalintent.extra_date";

    @Override
    protected Fragment createFragment() {
        Date crimeDate = (Date) getIntent().getSerializableExtra(EXTRA_CRIME_DATE);
        return DatePickerFragment.newInstance(crimeDate);
    }

    public static Intent newIntent(Context packageContext, Date crimeId) {
        Intent intent = new Intent(packageContext, DatePickerActivity.class);
        intent.putExtra(EXTRA_CRIME_DATE, crimeId);
        return intent;
    }


}
