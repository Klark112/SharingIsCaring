package sharingiscaring.sharingiscaring;

/**
 * Created by klark on 2/11/16.
 */
public class Move {
    private String moveName;
    // A move has a base multplier that it checks against the attack type
    private int damageMultiplier;
    private Type type; // each move has a SINGLE type
    private String attackType; //Physical or Special attacks determine
    // whether SpA or Att Stat is used
}
