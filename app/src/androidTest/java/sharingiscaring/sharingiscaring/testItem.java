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
