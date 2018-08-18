package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void Test() {
        //find the click button and click it
        onView(withId(R.id.buttonTellAJoke)).check(matches(withText(R.string.button_text)));

        //click the button to retrieve the joke
        onView(withId(R.id.buttonTellAJoke)).perform(click());

        //check that the text view with jokes is not blank
        onView(withId(R.id.textViewJokes)).check(matches(not(withText("Error getting joke"))));
    }
}