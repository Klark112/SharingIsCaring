package sharingiscaring.sharingiscaring;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.ListView;

/**
 * Created by hoye on 2/12/16.
 */
public class testViewBorrowedThings extends ActivityInstrumentationTestCase2 {
    public testViewMyThingsActivity(Class activityClass) { super(ViewMyThingsActivity.class); }

    public void testViewMyThings(){
        Intent intent = new Intent();
        User user = new User();
        Item item1 = new Item();

        user.borrow(item1);
        intent.putExtra(ViewMyThingsActivity.MODE_TO_TRANSFER_KEY, user);
        setActivityIntent(intent);  //onStart will populate the two ListViews


        ViewMyThingsActivity viewMe = (ViewMyThingsActivity) getActivity();
        ListView borrowedThingsList = (ListView) viewMe.findViewById(R.id.borrowedThingsList);

        View origin = (View) viewMe.findByViewId(R.id.ViewMyThings);
        ViewAsserts.assertOnScreen(origin, thingsList);
    }
}
