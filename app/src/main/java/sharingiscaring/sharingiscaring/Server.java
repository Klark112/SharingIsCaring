package sharingiscaring.sharingiscaring;

import java.util.ArrayList;

/**
 * Created by hoye on 2/10/16.
 */
public class Server {
    private ArrayList<User> users;
    private int identifier;

    public Server(){
        this.users = new ArrayList<User>();
        this.identifier = 0;
    }
    public Server(ArrayList<User> users, int identifier){
        this.users = users;
        this.identifier = identifier;
    }

    public ArrayList<User> getUsers(){
        return this.users;
    }
    public int getIdentifier(){
        return this.identifier;
    }

    public void setUsers(ArrayList<User> newUsers){
        this.users = newUsers;
    }
    public void setIdentifier(int newID){
        this.identifier = newID;
    }

    public void addUser(User user){
        this.users.add(user);
    }
    public int identify(){
        int retval = this.identifier;
        identifier += 1;
        return  retval;
    }

    public User getUser(String name){
        for (int i = 0; i < users.size(); i++){
            User user = users.get(i);
            if (user.getName() == name){
                return user;
            }
        }
        return null;
    }

    public Item getItem(int identifier){
        for (int i = 0; i < users.size(); i++){
            User user = users.get(i);
            ArrayList<Item> userItems = user.getOwnedItems();
            for (int j = 0; j < userItems.size(); j++){
                Item item = userItems.get(j);
                if (item.getIdentifier() == identifier){
                    return item;
                }
            }
        }
        return null;
    }

    public Item searchItem(String terms){
        return null;
    }

    public Boolean validateUsername(User user){
        String username = user.getName();
        for (int i = 0; i < users.size(); i++){
            String othername = users.get(i).getName();
            if (user.getName() == username){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

}
