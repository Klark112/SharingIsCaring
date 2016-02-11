package sharingiscaring.sharingiscaring;

import java.util.ArrayList;

/**
 * Created by hoye on 2/10/16.
 */
public class User {
    private String name;
    private ArrayList<Item> ownedItems;
    private ArrayList<Item> otherItems;
    private ArrayList<Bid> notifications;
    private String contact;
    private String phone;
    private String email;
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private String password;


    public User(){
        this.name = "default";
        this.ownedItems = new ArrayList<Item>();
        this.otherItems = new ArrayList<Item>();
        this.notifications = new ArrayList<Bid>();
        this.contact = "default";
        this.phone = "default";
        this.email = "default";
        this.streetAddress = "default";
        this.city = "default";
        this.province = "default";
        this.postalCode = "default";
        this.password = "";
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Item> getOwnedItems(){
        return this.ownedItems;
    }
    public ArrayList<Item> getBorrowedItems(){
        return this.otherItems;
    }
    public ArrayList<Bid> getNotifications() {return this.notifications; }
    public String getContact(){
        return this.contact;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getStreetAddress(){
        return this.streetAddress;
    }
    public String getCity(){
        return this.city;
    }
    public String getProvince(){
        return this.province;
    }
    public String getPostalCode(){
        return this.postalCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setOwnedItems(ArrayList<Item> newItems){
        this.ownedItems = newItems;
    }
    public void setOtherItems(ArrayList<Item> newItems){
        this.otherItems = newItems;
    }
    public void setNotifications(ArrayList<Bid> newNotifications){ this.notifications = newNotifications;}
    public void setContact(String newContact){
        this.contact = newContact;
    }
    public void setPhone(String newPhone){
        this.phone = newPhone;
    }
    public void  setEmail(String newEmail){
        this.email = newEmail;
    }
    public void setStreetAddress(String newAddress){
        this.streetAddress = newAddress;
    }
    public  void setCity(String newCity){
        this.city = newCity;
    }
    public void setProvince(String newProvince){
        this.province = newProvince;
    }
    public void setPostalCode(String newPostalCode){
        this.postalCode = newPostalCode;
    }

    public void addItem(Item item){
        this.ownedItems.add(item);
    }
    public void borrow(Item item){
        this.otherItems.add(item);
    }
    public void returnItem(Item item){
        item.setStatus(Item.RETURNED);
        this.otherItems.remove(item);
    }
    public void validateReturn(Item item){
        item.setStatus(Item.AVAILABLE);
    }
    public void removeItem(Item item) {this.ownedItems.remove(item);}
    public void update(){

    }
    public void bidNotify(Bid bid){
        this.notifications.add(bid);
    }

}
