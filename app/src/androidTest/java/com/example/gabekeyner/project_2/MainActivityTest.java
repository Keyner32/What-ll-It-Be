package com.example.gabekeyner.project_2;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;

/**
 * Created by GabeKeyner on 9/7/2016.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    //Tests for Main Activity
    @Test
    public void myDrinkButtonClick() throws Exception {


        onView(ViewMatchers.withId(R.id.my_drinks))
                .perform(click());

    }

    @Test
    public void exploreButtonClick() throws Exception {

        onView(ViewMatchers.withId(R.id.explore))
                .perform(click());

    }


}