package com.qtaaruf.uaspasi;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MenuEmpatTest {

    Double diagonal1 = 0.0;
    Double diagonal2 = 0.0;
    Double hasil = 0.0;

    @Rule
    public ActivityTestRule<MenuEmpat> mActivityTestRule = new ActivityTestRule<>(MenuEmpat.class);

//    @Test
//    public void menuEmpatTest() {
//    }

    @Before
    public void diagonal1() {
        diagonal1 = 2.0;
    }

    @Before
    public void diagonal2() {
        diagonal2 = 6.0;
    }

    @Before
    public void hasil() {
        hasil = 6.0;
    }

    @Test
    public void testHitung() {
//        onView(withId(R.id.editText_alas)).perform(typeText(alas), closeSoftKeyboard());
        onView(withId(R.id.editText_diagonal1)).perform(typeText(String.valueOf(diagonal1)), closeSoftKeyboard());
        onView(withId(R.id.editText_diagonal2)).perform(typeText(String.valueOf(diagonal2)), closeSoftKeyboard());
        onView(withId(R.id.btn_hitung4)).perform(click());

        onView(withId(R.id.textView_hasil4)).check(matches(withText(String.valueOf(hasil))));
    }
}
