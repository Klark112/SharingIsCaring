package sharingiscaring.sharingiscaring;

/**
 * Created by hoye on 2/10/16.
 */
public class Bid {
    private User bidder;
    private double rate;

    public Bid(){

    }
    public Bid(User bidder, double rate){
        this.bidder = bidder;
        this.rate = rate;
    }

    public User getBidder(){
        return this.bidder;
    }
    public double getRate(){
        return this.rate;
    }

    public void setUser(User newBidder){
        this.bidder = newBidder;
    }
    public void setRate(double newRate){
        this.rate = newRate;
    }
}
