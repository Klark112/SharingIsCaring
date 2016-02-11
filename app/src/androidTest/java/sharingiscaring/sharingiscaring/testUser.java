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
}
