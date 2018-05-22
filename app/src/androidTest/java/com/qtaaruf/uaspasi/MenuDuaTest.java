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
public class MenuDuaTest {

    Double sisi1 = 0.0;
    Double sisi2 = 0.0;
    Double hasil2 = 0.0;

    @Rule
    public ActivityTestRule<MenuDua> mActivityTestRule = new ActivityTestRule<>(MenuDua.class);

//    @Test
//    public void menuDuaTest() {
//    }

    @Before
    public void sisi1() {
        sisi1 = 2.0;
    }

    @Before
    public void sisi2() {
        sisi2 = 6.0;
    }

    @Before
    public void hasil2() {
        hasil2 = 6.0;
    }

    @Test
    public void testHitung2() {
//        onView(withId(R.id.editText_alas)).perform(typeText(alas), closeSoftKeyboard());
        onView(withId(R.id.editText_sisi1)).perform(typeText(String.valueOf(sisi1)), closeSoftKeyboard());
        onView(withId(R.id.editText_sisi2)).perform(typeText(String.valueOf(sisi2)), closeSoftKeyboard());
        onView(withId(R.id.btn_hitung2)).perform(click());

        onView(withId(R.id.textView_hasil2)).check(matches(withText(String.valueOf(hasil2))));
    }
}
