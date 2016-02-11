package sharingiscaring.sharingiscaring;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.TextView;

/**
 * Created by hoye on 2/10/16.
 */
public class testItem extends ActivityInstrumentationTestCase2{
    public testItem(){
        super(Item.class);
    }

    public void testDefault(){
        Item item = new Item();
        Server server = new Server();

        assertEquals("default", item.getDescription());
        assertEquals("default", item.getTitle());
        assertEquals("default", item.getOwner().getName());
        assertEquals(item.AVAILABLE, item.getStatus());
        assertTrue(item.getBids().isEmpty());
    }

    public void testEditItem(){
        Item item = new Item();
        item.setTitle("Non-default");
        item.setDescription("Non-default");
        item.setStatus(Item.BIDDING);

        assertTrue(item.getTitle() == "Non-default");
        assertTrue(item.getDescription() == "Non-default");
        assertTrue(item.getStatus() == Item.BIDDING);
    }

    public void testStatuses(){
        Item item = new Item();
        assertTrue(Item.AVAILABLE == item.getStatus());
        item.setStatus(Item.BIDDING);
        assertTrue(Item.BIDDING == item.getStatus());
        item.setStatus(Item.BORROWED);
        assertTrue(Item.BORROWED == item.getStatus());
        item.setStatus(Item.RETURNED);
        assertTrue(Item.RETURNED == item.getStatus());
        item.setStatus(Item.BIDDING);
    }

    public void testAddBid(){
        Item item = new Item();
        Bid bid = new Bid(new User(), 10.3);
        item.addBid(bid);
        assertFalse(item.getBids().isEmpty());
    }

    public void testClearBids(){
        Item item = new Item();
        Bid bid = new Bid(new User(), 10.3);
        item.addBid(bid);
        item.clearBids();
        assertTrue(item.getBids().isEmpty());
    }
    public void testViewMyThings(){ // come back to after talking with stuart 01.02.01
        Intent intent = new Intent();

        setActivityIntent(intent);
       // Item item = (Item)getActivity();

        //TextView textView = (TextView) user.findViewById(R.id.intentText);
       // assertEquals("The text should be displayed!", "default text",
        //        textView.getText().toString());
    }

    public void testViewOneThing(){ // 01.03.01
        Intent intent = new Intent();
        setActivityIntent(intent);
        //just setting up skeletal tests
    }
    public void testSearch(){ //where are we adding these items to that allows us to search for them 04.01.01
        Server server = new Server();
        Item item = new Item();
    }

    public void testItemDetails(){ // 04.02.01
        Intent intent = new Intent();
        setActivityIntent(intent);
    }
    public void testViewBorrowThings(){//06.01.01

    }

    public void testViewLoanedThings(){ //06.02.01 listed in the wiki under test cases as 06.01.01

    }

}
