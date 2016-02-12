package sharingiscaring.sharingiscaring;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.ListView;

/**
 * Created by klark on 2/12/16.
 */
public class testViewOneThingActivity extends ActivityInstrumentationTestCase2 {
    public testViewOneThingActivity(Class activityClass) { super(ViewOneThingActivity.class); }

    public void testViewOneThing(){
        Intent intent = new Intent();
        User user = new User();
        Item item1 = new Item();
        int index = 0;

        user.addItem(item1);
        intent.putExtra(ViewOneThingActivity.POKEMON_NAME, user.getOwnedItems().
                get(index).getName());
        intent.putExtra(ViewOneThingActivity.POKEMON_DESCRIPTION, user.getOwnedItems().
                get(index).getDescription());
        setActivityIntent(intent);  //onStart will populate the ListView


        ViewOneThingActivity viewMe = (ViewOneThingActivity) getActivity();

        View origin = (View) viewMe.findViewById(R.id.ViewOneThing);
        View name = (View) viewMe.findByViewId(R.id.ViewOneName);
        View description = (View) viewMe.findByViewId(R.id.ViewOneDescription);

        ViewAsserts.assertOnScreen(origin, name);
        ViewAsserts.assertOnScreen(origin, description);
    }
    //public void testViewOneThing(){ // 01.03.01
    //    Intent intent = new Intent();
    //    intent.putExtra(ViewOneThingActivity.POKEMON_NAME, "test name");
    //    intent.putExtra(ViewOneThingActivity.POKEMON_DESCRIPTION, "test description");
    //
    //    setActivityIntent(intent);
    //    ViewOneThingActivity viewMe = (ViewOneThingActivity) getActivity();
    //
    //    assertEquals("test name", viewMe.getName());
    //    assertEquals("test description", viewMe.getDescription());
    //}
}
