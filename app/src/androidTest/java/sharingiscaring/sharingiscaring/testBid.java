package sharingiscaring.sharingiscaring;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;

/**
 * Created by hoye on 2/10/16.
 */
public class testBid extends ActivityInstrumentationTestCase2 {

    public testBid(){
        super(Bid.class);
    }

    @UiThreadTest
    public void testBidCons(){
        User user1 = new User();
        User user2 = new User();
        user2.setName("Terry");
        Bid bid1 = new Bid(user1, 5.75);
        Bid bid2 = new Bid(user2, 3.00);
        assertEquals(5.75, bid1.getRate());
        assertEquals(3.00, bid2.getRate());
        assertNotSame("Testing that the names are different",
                        bid1.getBidder().getName(),
                        bid2.getBidder().getName());
        assertEquals(user1, bid1.getBidder());
        assertEquals(user2, bid2.getBidder());
    }
}
