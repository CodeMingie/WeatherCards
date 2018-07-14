package com.weather.ming.newcards;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;
import android.test.suitebuilder.annotation.SmallTest;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void setUp()
    {
        String setup = "test";
    }

    public void tearDown()
    {
        Log.d("test", "tear down");
    }

    @SmallTest
    public void testMethod()
    {
        GetServiceData data = new GetServiceData();

        try { data.GetForcast("Malden, us", Constants.Hours);}
        catch(Exception e)
        { e.getMessage(); }
    }

}