package sharingiscaring.sharingiscaring;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by klark on 2/12/16.
 */
public class testSearchThingsActivity extends ActivityInstrumentationTestCase2 {
    public testSearchThingsActivity(Class activityClass) { super(SearchThingsActivity.class); }

    public void testSearchThings(String input){
        Intent intent = new Intent();
        User borrower = new User();
        String search = "default";//user would input this search term
        Item item1 = new Item();
        boolean found = false;
        borrower.addItem(item1);

        for(int i=0; i<borrower.getOwnedItems().size(); i++) {
            if(borrower.getOwnedItems().get(i).getTitle().equals(search)){
                found = true;
            }
        }
        assertEquals(found,true);//assert that the search was successful in finding the item
        
        intent.putExtra(SearchThingsActivity.MODE_TO_TRANSFER_KEY, borrower);
        setActivityIntent(intent);  //onStart will populate the ListView


        SearchThingsActivity viewMe = (SearchThingsActivity) getActivity();
        ListView searchList = (ListView) viewMe.findViewById(R.id.searchlist);

        View origin = (View) viewMe.findByViewId(R.id.SearchThings);
        ViewAsserts.assertOnScreen(origin, searchList);

    }

}
