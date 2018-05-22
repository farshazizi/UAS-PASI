package com.qtaaruf.uaspasi;


import android.content.Intent;
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
public class MainActivityTest {

    String username, password;

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

//    @Test
//    public void mainActivityTest() {
//    }

    @Before
    public void username() {
        username = "Admin";
    }

    @Before
    public void password() {
        password = "admin";
    }

//    @Before
//    public void testBtnLogin() {
//        onView(withId(R.id.btn_login)).perform(click());
//    }

    @Test
    public void testLogin() {
        // Type text and then press the button.
        onView(withId(R.id.editText_username)).perform(typeText(username), closeSoftKeyboard());
        onView(withId(R.id.editText_password)).perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.btn_login)).perform(click());
        Intent intent = new Intent(mActivityTestRule.getActivity(), Main2Activity.class);
        intent.getAction();

//        if (onView(withId(R.id.editText_username)).equals(matches(withText(username))) && onView(withId(R.id.editText_password)).equals(matches(withText(password)))) {
//            onView(withId(R.id.btn_login)).perform(click());
//        }

        // Check that the text was changed.
//        onView(withId(R.id.editText_username)).check(matches(withText(username)));
//        onView(withId(R.id.editText_password)).check(matches(withText(password)));
    }
}
