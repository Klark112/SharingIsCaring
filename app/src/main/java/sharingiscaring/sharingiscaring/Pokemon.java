package sharingiscaring.sharingiscaring;

import java.util.ArrayList;

/**
 * Created by klark on 2/11/16.
 */
public class Pokemon extends Item {
    private ArrayList<Integer> stats;
    //Should we contract the variable names to HP, Att, Def, SpA, SpD, Spe
    private String Ability;
    private int Level;
    private int HealthPoints;
    private int Attack;
    private int Defense;
    private int SpecialAttack;
    private int SpecialDefense;
    private int Speed;
    private Type PrimaryType;
    private Type SecondaryType;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;
    //should we give nature and item their own class because the impact the stats
    private String nature;
    // talk with group about using items or not due to variety and ease of implementation
    private String item;

}
