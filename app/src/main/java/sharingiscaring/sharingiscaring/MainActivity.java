package sharingiscaring.sharingiscaring;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    //tell My PC button where to go
    public void FinishAdding(View v){setContentView(R.layout.my_pc); }
    //implement view button
    View.OnClickListener finish_adding = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.my_pc);
            (findViewById(R.id.finishAdding)).setOnClickListener(finish_adding);
        }
    };
    //tell My PC button where to go
    public void MyPC(View v){setContentView(R.layout.my_pc); }
    //implement view button
    View.OnClickListener mypc = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.my_pc);
            (findViewById(R.id.button5)).setOnClickListener(mypc);
        }
    };
    //tell view button where to go
    public void AddPokemon(View v){setContentView(R.layout.add_pokemon_main); }
    //implement view button
    View.OnClickListener viewButton = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.add_pokemon_main);
            (findViewById(R.id.change1)).setOnClickListener(viewButton);
        }
    };
    //tell view button where to go
    public void myPC(View v){setContentView(R.layout.my_pc); }
    //implement view button
    View.OnClickListener viewButton1 = new View.OnClickListener() {
        public void onClick(View v) {
            setContentView(R.layout.my_pc);
            (findViewById(R.id.addPokemon)).setOnClickListener(viewButton1);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
