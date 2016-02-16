package sharingiscaring.sharingiscaring;

import java.util.ArrayList;

/**
 * Created by klark on 2/11/16.
 */
public class Pokemon extends Item {
    //private ArrayList<Integer> stats; for now i am ignoring EV's and IV's
    //Should we contract the variable names to HP, Att, Def, SpA, SpD, Spe
    private String Ability;
    private int Level;
    private int HealthPoints;
    private int Attack;
    private int Defense;
    private int SpecialAttack;
    private int SpecialDefense;
    private int Speed;
    private String PrimaryType;
    private String SecondaryType;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;
    //should we give nature and item their own class because the impact the stats
    private String nature;
    // talk with group about using items or not due to variety and ease of implementation
    private String pokemonItem;

    public Pokemon(int identifier, User owner, String title, String description,
                   ArrayList<Bid> bids, String ability, int level, int healthPoints, int attack,
                   int defense, int specialAttack, int specialDefense, int speed,
                   String primaryType, String secondaryType,Move move1, Move move2,
                   Move move3, Move move4, String nature, String pokemonItem) {
        super(identifier, owner, title, description, bids);
        Ability = ability;
        Level = level;
        HealthPoints = healthPoints;
        Attack = attack;
        Defense = defense;
        SpecialAttack = specialAttack;
        SpecialDefense = specialDefense;
        Speed = speed;
        PrimaryType = primaryType;
        SecondaryType = secondaryType;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
        this.nature = nature;
        this.pokemonItem= pokemonItem;
    }

    public String getAbility() {return Ability;}
    public void setAbility(String ability) {Ability = ability;}

    public int getLevel() {return Level;}
    public void setLevel(int level) {Level = level;}

    public int getHealthPoints() {return HealthPoints;}
    public void setHealthPoints(int healthPoints) {HealthPoints = healthPoints;}

    public int getAttack() {return Attack;}
    public void setAttack(int attack) {Attack = attack;}

    public int getDefense() {return Defense;}
    public void setDefense(int defense) {Defense = defense;}

    public int getSpecialAttack() {return SpecialAttack;}
    public void setSpecialAttack(int specialAttack) {SpecialAttack = specialAttack;}

    public int getSpecialDefense() {return SpecialDefense;}
    public void setSpecialDefense(int specialDefense) {SpecialDefense = specialDefense;}

    public int getSpeed() {return Speed;}
    public void setSpeed(int speed) {Speed = speed;}

    public String getPrimaryType() {return PrimaryType;}
    public void setPrimaryType(String primaryType) {PrimaryType = primaryType;}

    public String getSecondaryType() {return SecondaryType;}
    public void setSecondaryType(String secondaryType) {SecondaryType = secondaryType;}

    public Move getMove1() {return move1;}
    public void setMove1(Move move1) {this.move1 = move1;}

    public Move getMove2() {return move2;}
    public void setMove2(Move move2) {this.move2 = move2;}

    public Move getMove3() {return move3;}
    public void setMove3(Move move3) {this.move3 = move3;}

    public Move getMove4() {return move4;}
    public void setMove4(Move move4) {this.move4 = move4;}

    public String getNature() {return nature;}
    public void setNature(String nature) {this.nature = nature;}

    public String getPokemonItem() {return pokemonItem;}
    public void setItem(String pokemonItem) {this.pokemonItem = pokemonItem;}
}
