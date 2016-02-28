package sharingiscaring.sharingiscaring;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by tonysunyueran on 28/02/2016.
 */
public class Edit_Pokemon extends AppCompatActivity {
    private  static final String FILENAME= "file.sav";

    //Since we do not have Select Activity yet,so there might be
    //some problem to implement this
    private ArrayList<Pokemon> entry=new ArrayList<Pokemon>();
    private  Pokemon show_original_data;


    public void onCreate(Bundle savedInstanceState){
        loadFromFile();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pokemon);
        Button FinishEdit=(Button) findViewById(R.id.finishEditing);


        //We do not have any Select_item Activity yet
        //selection_identifier is the index to let us know which item we have selected
        // to edit
        show_original_data=entry.get(SelectActivity.selection_identifier);

        //Allow user to use Edit Text to change the original data
        final TextView EditPokemonName = (TextView) findViewById(R.id.editName);
        final TextView EditDescription = (TextView) findViewById(R.id.editDescription);
        final TextView EditAbility = (TextView) findViewById(R.id.editAbility);
        final TextView EditLevel = (TextView) findViewById(R.id.editLevel);
        final TextView EditHealthPoints = (TextView) findViewById(R.id.editHealthPoints);
        final TextView EditAttack = (TextView) findViewById(R.id.editAttack);

        final TextView EditDefense = (TextView) findViewById(R.id.editDefense);
        final TextView EditSpecialAttack = (TextView) findViewById(R.id.editSpecialAttack);
        final TextView EditSpecialDefence = (TextView) findViewById(R.id.editSpecialDefense);
        final TextView EditSpeed = (TextView) findViewById(R.id.editSpeed);
        final TextView EditPrimaryType = (TextView) findViewById(R.id.editPrimaryType);
        final TextView EditSecondaryType = (TextView) findViewById(R.id.editSecondaryType);

        final TextView EditMove1 = (TextView) findViewById(R.id.editMove1);
        final TextView EditMove2 = (TextView) findViewById(R.id.editMove2);
        final TextView EditMove3 = (TextView) findViewById(R.id.editMove3);
        final TextView EditMove4 = (TextView) findViewById(R.id.editMove4);
        final TextView EditNature = (TextView) findViewById(R.id.editNature);
        final TextView EditPokemonItem = (TextView) findViewById(R.id.editPokemonItem);

        //This part simply we use getter method from Class Pokemon to
        // show the original data that user entered before
        EditPokemonName.setText(show_original_data.getPokemonName());
        EditDescription.setText(show_original_data.getDescription());
        EditAbility.setText(show_original_data.getAbility());
        EditLevel.setText(String.valueOf(show_original_data.getLevel()));
        EditHealthPoints.setText(String.valueOf(show_original_data.getHealthPoints()));
        EditAttack.setText(String.valueOf(show_original_data.getAttack()));

        EditDefense.setText(String.valueOf(show_original_data.getDefense()));
        EditSpecialAttack.setText(String.valueOf(show_original_data.getSpecialAttack()));
        EditSpecialDefence.setText(String.valueOf(show_original_data.getSpecialDefense()));
        EditSpeed.setText(String.valueOf(show_original_data.getSpeed()));
        EditPrimaryType.setText(show_original_data.getPrimaryType());
        EditSecondaryType.setText(show_original_data.getSecondaryType());



        EditMove1.setText(String.valueOf(show_original_data.getMove1()));
        EditMove2.setText(String.valueOf(show_original_data.getMove2()));
        EditMove3.setText(String.valueOf(show_original_data.getMove3()));
        EditMove4.setText(String.valueOf(show_original_data.getMove4()));
        EditNature.setText(show_original_data.getNature());
        EditPokemonItem.setText(show_original_data.getPokemonItem());

        FinishEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    //Use get_text method to allow user to enter the new data they want to Edit
                    String PokeMonName = EditPokemonName.getText().toString();
                    String Description = EditDescription.getText().toString();
                    String Ability = EditAbility.getText().toString();
                    String Level = EditLevel.getText().toString();
                    String PrimaryType = EditPrimaryType.getText().toString();
                    String SecondaryType = EditSecondaryType.getText().toString();

                    String HealthPointsString = EditHealthPoints.getText().toString();
                    String AttackString = EditAttack.getText().toString();
                    String DefenceString = EditDefense.getText().toString();
                    String SpecialAttackString = EditAttack.getText().toString();
                    String SpecialDefenseString = EditSpecialDefence.getText().toString();
                    String SpeedString = EditSpeed.getText().toString();



                    String Move1 = EditMove1.getText().toString();
                    String Move2 = EditMove2.getText().toString();
                    String Move3 = EditMove3.getText().toString();
                    String Move4 = EditMove4.getText().toString();
                    String Nature = EditNature.getText().toString();
                    String PokemonItem = EditPokemonItem.getText().toString();


                    //Convert HealthPoints Attack Defence... to integer type
                    int HealthPoints = Integer.parseInt(HealthPointsString);
                    int Attack = Integer.parseInt(AttackString);
                    int Defence = Integer.parseInt(DefenceString);
                    int SpecialAttack = Integer.parseInt(SpecialAttackString);
                    int SpecialDefense = Integer.parseInt(SpecialDefenseString);
                    int Speed = Integer.parseInt(SpeedString);
                    int levels= Integer.parseInt(Level);




                    //Use set method from Pokemon to Allow user to set the new data
                    show_original_data.setPokemonName(PokeMonName);
                    show_original_data.setDescription(Description);
                    show_original_data.setAbility(Ability);
                    show_original_data.setLevel(levels);
                    show_original_data.setPrimaryType(PrimaryType);
                    show_original_data.setSecondaryType(SecondaryType);



                    //At here, moves has to be a "Move" type, Still have trouble to figure out how
                    //to convert move from "String" to "Move" type.

                    show_original_data.setMove1(Move1);
                    show_original_data.setMove2(Move2);
                    show_original_data.setMove3(Move3);
                    show_original_data.setMove4(Move4);
                    show_original_data.setNature(Nature);
                    show_original_data.setPokemonItem(PokemonItem);

                    show_original_data.setHealthPoints(HealthPoints);
                    show_original_data.setAttack(Attack);
                    show_original_data.setDefense(Defence);
                    show_original_data.setSpecialAttack(SpecialAttack);
                    show_original_data.setSpecialDefense(SpecialDefense);
                    show_original_data.setSpeed(Speed);


                    saveInFile();
                    loadFromFile();
                    finish();
                    //Check does user input the correct type of the data
                } catch (NumberFormatException e) {
                    Toast.makeText(Edit_Pokemon.this, "Data does not enter correctly", Toast.LENGTH_SHORT).show();
                }
            }

        });



    }


    private void loadFromFile() {

        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            Gson gson= new Gson();

            //
            Type listType = new TypeToken<ArrayList<Pokemon>>() {}.getType();
            entry=gson.fromJson(in, listType);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block

            entry=new ArrayList<Pokemon>();
        } catch (IOException e) {
            // TODO Auto-generated catch block

            throw new RuntimeException();

        }
    }

    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME,
                    Context.MODE_PRIVATE);


            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(fos));
            Gson gson= new Gson();
            gson.toJson(entry, out);
            out.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            ;
            throw new RuntimeException();
        } catch (IOException e) {
            // TODO Auto-generated catch block

            throw new RuntimeException();
        }
    }

}
