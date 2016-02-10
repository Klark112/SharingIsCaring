package sharingiscaring.sharingiscaring;

import java.util.ArrayList;

/**
 * Created by hoye on 2/10/16.
 */
public class Item {
    private int identifier;
    private User owner;
    private String title;
    private String description;
    private int status;
    private ArrayList<Bid> bids;

    public static final int AVAILABLE = 1;
    public static final int BIDDING = 2;
    public static final int BORROWED = 3;
    public static final int RETURNED = 4;

    public Item(){

    }

    public Item(int identifier, User owner, String title, String description, ArrayList<Bid> bids){
        this.identifier = identifier;
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.status = AVAILABLE;
        this.bids = bids;
    }

    public User getOwner(){
        return this.owner;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public int getIdentifier(){
        return this.identifier;
    }
    public int getStatus(){
        return this.status;
    }
    public ArrayList<Bid> getBids(){
        return this.bids;
    }

    public void setOwner(User newOwner){
        this.owner = newOwner;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setStatus(int newStatus){
        this.status = newStatus;
    }
    public void setBids(ArrayList<Bid> newBids){
        this.bids = newBids;
    }

    public void addBid(Bid bid){
        this.bids.add(bid);
    }
    public void clearBids() {
        this.bids.clear();
    }
}
