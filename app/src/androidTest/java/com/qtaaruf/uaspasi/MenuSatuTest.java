package com.qtaaruf.uaspasi;


import android.support.test.espresso.core.deps.guava.base.Strings;
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
public class MenuSatuTest {

    Double alas = 0.0;
    Double tinggi = 0.0;
    Double hasil = 0.0;

    @Rule
    public ActivityTestRule<MenuSatu> mActivityTestRule = new ActivityTestRule<>(MenuSatu.class);

//    @Test
//    public void menuSatuTest() {
//    }

    @Before
    public void alas() {
        alas = 2.0;
    }

    @Before
    public void tinggi() {
        tinggi = 6.0;
    }

    @Before
    public void hasil() {
        hasil = 6.0;
    }

    @Test
    public void testHitung() {
//        onView(withId(R.id.editText_alas)).perform(typeText(alas), closeSoftKeyboard());
        onView(withId(R.id.editText_alas)).perform(typeText(String.valueOf(alas)), closeSoftKeyboard());
        onView(withId(R.id.editText_tinggi)).perform(typeText(String.valueOf(tinggi)), closeSoftKeyboard());
        onView(withId(R.id.btn_hitung)).perform(click());

        onView(withId(R.id.textView_hasil)).check(matches(withText(String.valueOf(hasil))));
    }
}
