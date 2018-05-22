package com.qtaaruf.uaspasi;


import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Main2ActivityTest {

    @Rule
    public ActivityTestRule<Main2Activity> mActivityTestRule = new ActivityTestRule<>(Main2Activity.class);

//    @Test
//    public void main2ActivityTest() {
//    }

    @Test
    public void menuSatu() {
        onView(withId(R.id.rl_menu1)).perform(click());
        Intent intent = new Intent(mActivityTestRule.getActivity(), MenuSatu.class);
        intent.getAction();
    }

    @Test
    public void menuDua() {
        onView(withId(R.id.rl_menu2)).perform(click());
        Intent intent = new Intent(mActivityTestRule.getActivity(), MenuDua.class);
        intent.getAction();
    }

    @Test
    public void menuTiga() {
        onView(withId(R.id.rl_menu3)).perform(click());
        Intent intent = new Intent(mActivityTestRule.getActivity(), MenuTiga.class);
        intent.getAction();
    }

    @Test
    public void menuEmpat() {
        onView(withId(R.id.rl_menu4)).perform(click());
        Intent intent = new Intent(mActivityTestRule.getActivity(), MenuEmpat.class);
        intent.getAction();
    }

}
