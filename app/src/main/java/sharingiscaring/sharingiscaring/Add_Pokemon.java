package sharingiscaring.sharingiscaring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Stu on 2016-03-03.
 */
public class Add_Pokemon extends AppCompatActivity{
    String problemTag = "Add Pokemon Error";
    private User user;          // The user the Pokemon belongs to.
    private Pokemon pokemon;    // The pokemon that we will assign to the user.

    // References to the resources onscreen
    private EditText name;
    private EditText description;
    private EditText ability;
    private EditText level;
    private EditText health;
    private EditText attack;
    private EditText defense;
    private EditText s_attack;
    private EditText s_defense;
    private EditText speed;
    private EditText type1;
    private EditText type2;
    private EditText move1;
    private EditText move2;
    private EditText move3;
    private EditText move4;
    private EditText nature;
    private EditText item;
    private Button add;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_pokemon_main);
        this.user = new User(); // TODO: gather info about the user from the parent activity.
        this.name = (EditText) findViewById(R.id.editName);
        this.description = (EditText) findViewById(R.id.editDescription);
        this.ability = (EditText) findViewById(R.id.editAbility);
        this.level = (EditText) findViewById(R.id.editLevel);
        this.health = (EditText) findViewById(R.id.editHealthPoints);
        this.attack = (EditText) findViewById(R.id.editAttack);
        this.defense = (EditText) findViewById(R.id.editDefense);
        this.s_attack = (EditText) findViewById(R.id.editSpecialAttack);
        this.s_defense = (EditText) findViewById(R.id.editSpecialDefense);
        this.speed = (EditText) findViewById(R.id.editSpeed);
        this.type1 = (EditText) findViewById(R.id.editPrimaryType);
        this.type2 = (EditText) findViewById(R.id.editSecondaryType);
        this.move1 = (EditText) findViewById(R.id.editMove1);
        this.move2 = (EditText) findViewById(R.id.editMove2);
        this.move3 = (EditText) findViewById(R.id.editMove3);
        this.move4 = (EditText) findViewById(R.id.editMove4);
        this.nature = (EditText) findViewById(R.id.editNature);
        this.item = (EditText) findViewById(R.id.editPokemonItem);
        this.add = (Button) findViewById(R.id.finishAdding);
    }

    protected void onStart(){
        super.onStart();
    }

    protected Boolean areValid(ArrayList<String> values){
        // TODO: Iterate over the array & ensure data is correct
        try {
            Integer.decode(values.get(3));
            Integer.decode(values.get(4));
            Integer.decode(values.get(5));
            Integer.decode(values.get(6));
            Integer.decode(values.get(7));
            Integer.decode(values.get(8));
            Integer.decode(values.get(9));
        } catch (Exception e){
            Log.i(problemTag, "Error Validating Input");
        }
        return Boolean.TRUE;
    }

    public void finishAdding() {
        ArrayList<String> stringValues = new ArrayList<String>();

        String nameText = name.getText().toString();
        String descriptionText = description.getText().toString();
        String abilityText = ability.getText().toString();
        String levelText = level.getText().toString();
        String healthText = health.getText().toString();
        String attackText = attack.getText().toString();
        String defenseText = defense.getText().toString();
        String s_attackText = s_attack.getText().toString();
        String s_defenseText = s_defense.getText().toString();
        String speedText = speed.getText().toString();
        String type1Text = type1.getText().toString();
        String type2Text = type2.getText().toString();
        String move1Text = move1.getText().toString();
        String move2Text = move2.getText().toString();
        String move3Text = move3.getText().toString();
        String move4Text = move4.getText().toString();
        String natureText = nature.getText().toString();
        String itemText = item.getText().toString();

        stringValues.add(nameText);
        stringValues.add(descriptionText);
        stringValues.add(abilityText);
        stringValues.add(levelText);
        stringValues.add(healthText);
        stringValues.add(attackText);
        stringValues.add(defenseText);
        stringValues.add(s_attackText);
        stringValues.add(s_defenseText);
        stringValues.add(speedText);
        stringValues.add(type1Text);
        stringValues.add(type2Text);
        stringValues.add(move1Text);
        stringValues.add(move2Text);
        stringValues.add(move3Text);
        stringValues.add(move4Text);
        stringValues.add(natureText);
        stringValues.add(itemText);

        if (areValid(stringValues)) {
            // TODO: Update Moves in Pokemon to Strings.

            // Pokemon addedPokemon = new Pokemon(0, user, nameText, descriptionText, null, abilityText,
            //         Integer.decode(levelText), Integer.decode(healthText),
            //        Integer.decode(attackText), Integer.decode(defenseText),
            //        Integer.decode(s_attackText), Integer.decode(s_defenseText),
            //        Integer.decode(speedText), type1Text, type2Text, move1Text,
            //        move2Text, move3Text, move4Text, natureText, itemText);

            // try {
            //     int id = upload(addedPokemon);
            //     addedPokemon.setID(id);
            // } catch (Exception e){
            //     Log.i(problemTag, "Did not upload Pokemon successfully.");
            // }

            // user.addItem(addedPokemon);
            finish();
        }
    }
}
