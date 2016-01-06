
// PROJECT_NAME - PROJECT_SHORT_DESCRIPTION
//
// Written in PROJECT_COPY_YEAR by PROJECT_AUTHOR PROJECT_CONTACT_EMAIL
//
// To the extent possible under law, the author(s) have dedicated all copyright
// and related and neighboring rights to this software to the public domain worldwide.
// This software is distributed without any warranty.
//
// You should have received a copy of the CC0 Public Domain Dedication along with this software.
// If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.

package PROJECT_TLD.PROJECT_DOMAIN.PROJECT_NAME;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class IdentityBehaviourTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testShouldReturnAValueOnClick() {
        onView(withId(R.id.inputField)).perform(typeText("0"));
        onView(withId(R.id.evaluateButton)).perform(click());
        onView(withId(R.id.evaluatedResult)).check(matches(withText("0")));
    }
}
