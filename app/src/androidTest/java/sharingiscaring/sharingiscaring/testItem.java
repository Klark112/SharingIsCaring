package sharingiscaring.sharingiscaring;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;

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
}
