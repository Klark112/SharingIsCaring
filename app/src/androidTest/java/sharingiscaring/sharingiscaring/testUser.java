package sharingiscaring.sharingiscaring;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.TextView;

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

    public void testUsername(){
        User user1 = new User();
        User user2 = new User();
        Server server = new Server();

        server.addUser(user1);
        assertFalse(server.validateUsername(user2));
    }

    public void testReturnThing(){
        User user1 = new User();
        User user2 = new User();
        Item item = new Item();
        item.setStatus(Item.BORROWED);
        user1.addItem(item);
        user2.borrow(item);

        assertFalse(user1.getOwnedItems().isEmpty());
        assertFalse(user2.getBorrowedItems().isEmpty());

        user2.returnItem(item);

        assertTrue(user2.getBorrowedItems().isEmpty());
        assertTrue(item.getStatus() == Item.RETURNED);

        user1.validateReturn(item);

        assertTrue(Item.AVAILABLE == item.getStatus());
    }

    public void testUpdate(){
        Server server = new Server();
        User user = new User();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        server.addUser(user);
        user.addItem(item1);
        user.addItem(item2);
        user.addItem(item3);

        assertTrue(server.getUser(user.getName()).getOwnedItems().isEmpty());
        user.update();
        assertFalse(server.getUser(user.getName()).getOwnedItems().isEmpty());
    }

    public void testViewOtherUser(){
        Intent intent = new Intent();
        Server server = new Server();
        User user1 = new User();
        User user2 = new User();
        String testName = "non-default";

        user2.setName(testName);
        server.addUser(user1);
        server.addUser(user2);
        intent.putExtra(ViewOneThingActivity.USER_NAME, testName);
        setActivityIntent(intent);

        ViewOneThingActivity viewMe = (ViewOneThingActivity) getActivity();
        TextView username = viewMe.findViewById(R.id.username);
        viewMe.fetch(username.getText().toString());

        View origin = (View) viewMe.findByViewId(R.id.viewOneThing);
        View userInfo = viewMe.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(origin, userInfo);
    }
}
