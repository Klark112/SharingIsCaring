package sharingiscaring.sharingiscaring;

/**
 * Created by klark on 2/11/16.
 */
public class Move {
    private String moveName;
    // A move has a base power that it checks against the attack type
    // ie. drain punch has a power of 75
    private int damagePower;
    private int accuracy;
    private String type; // each move has a SINGLE type
    private String attackType; //Physical or Special attacks determine

    public Move(String moveName, int damagePower, int accuracy, String type, String attackType) {
        this.moveName = moveName;
        this.damagePower = damagePower;
        this.accuracy = accuracy;
        this.type = type;
        this.attackType = attackType;
    }

    public String getMoveName() {return moveName;}
    public void setMoveName(String moveName) {this.moveName = moveName; }

    public int getDamagePower() {return damagePower;}
    public void setDamagePower(int damagePower) {this.damagePower = damagePower;}

    public int getAccuracy() {return accuracy;}
    public void setAccuracy(int accuracy) {this.accuracy = accuracy;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getAttackType() {return attackType;}
    public void setAttackType(String attackType) {this.attackType = attackType;}
    // whether SpA or Att Stat is used
}
