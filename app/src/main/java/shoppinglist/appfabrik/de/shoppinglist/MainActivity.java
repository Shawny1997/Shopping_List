package shoppinglist.appfabrik.de.shoppinglist;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import static android.view.View.*;

public class MainActivity extends Activity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final EditText editText1 = (EditText) findViewById(R.id.addItem);
        final TextView editText2 = (TextView) findViewById(R.id.showItems);
        Button button =(Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                editText2.setText(editText1.getText() + ", " + editText2.getText());
            }});}





            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                //f Inflate the menu; this adds items to the action bar if it is present.
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

