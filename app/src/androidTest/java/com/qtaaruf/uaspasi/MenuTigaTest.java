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
public class MenuTigaTest {

    Double jari = 0.0;
    Double hasil = 0.0;

    @Rule
    public ActivityTestRule<MenuTiga> mActivityTestRule = new ActivityTestRule<>(MenuTiga.class);

//    @Test
//    public void menuTigaTest() {
//    }

    @Before
    public void jari() {
        jari = 9.5;
    }

    @Before
    public void hasil() {
        hasil = 22.0;
    }

    @Test
    public void testHitung() {
//        onView(withId(R.id.editText_alas)).perform(typeText(alas), closeSoftKeyboard());
        onView(withId(R.id.editText_jari)).perform(typeText(String.valueOf(jari)), closeSoftKeyboard());
        onView(withId(R.id.btn_hitung3)).perform(click());

        onView(withId(R.id.textView_hasil3)).check(matches(withText(String.valueOf(hasil))));
    }
}
