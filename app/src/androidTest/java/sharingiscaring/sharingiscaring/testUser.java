package sharingiscaring.sharingiscaring;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by hoye on 2/10/16.
 */
public class testUser extends ActivityInstrumentationTestCase2 {

    public testUser() {
        super(User.class);
    }

    public void testAddItem(){
        User user = new User();
        Item item = new Item();

        assertTrue(user.getOwnedItems().isEmpty());
        user.addItem(item);
        assertFalse(user.getOwnedItems().isEmpty());
    }

    public void testRemoveItem(){
        User user = new User();
        Item item = new Item();

        user.addItem(item);
        assertFalse(user.getOwnedItems().isEmpty());
        user.removeItem(item);
        assertTrue(user.getOwnedItems().isEmpty());
    }

    public void testEditInfo(){
        User user = new User();
        user.setName("Harry");
        user.setCity("Colorado");
        user.setPhone("780-000-0000");
        user.setEmail("harry@colorado.com");
        user.setPostalCode("A0A-Z9Z");
        user.setProvince("Denver");

        assertTrue("Harry" == user.getName());
        assertTrue("Colorado" == user.getCity());
        assertTrue("780-000-0000" == user.getPhone());
        assertTrue("harry@colorado.com" == user.getEmail());
        assertTrue("A0A-Z9Z" == user.getPostalCode());
        assertTrue("Denver" == user.getProvince());
    }

    public void testNotify(){
        User user = new User();
        Bid bid = new Bid();

        assertTrue(user.getNotifications().isEmpty());
        user.bidNotify(bid);
        assertFalse((user.getNotifications().isEmpty()));
    }
}
