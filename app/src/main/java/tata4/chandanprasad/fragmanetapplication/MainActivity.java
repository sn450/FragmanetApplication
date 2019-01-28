package tata4.chandanprasad.fragmanetapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button activityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the reference of Button
        activityButton = (Button) findViewById(R.id.activity_button);

        // perform setOnClickListener event on Button
        activityButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Toast.makeText(getApplicationContext(), "Activity's Button", Toast.LENGTH_LONG).show();
            }
        });
    }

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
        if(id==R.id.action_settings)
        {
            startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
            return true;
        }
        if (id == R.id.action_fragmnt) {
            Intent test = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(test);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
