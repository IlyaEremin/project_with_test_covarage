package com.flatstack.alltestproject;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private CharSequence appTitle;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        appTitle = activity.getTitle();
        Assert.assertTrue(appTitle.equals(activity.getResources().getString(R.string.app_name)));

    }
}