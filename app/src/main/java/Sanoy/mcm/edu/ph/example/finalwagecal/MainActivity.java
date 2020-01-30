package Sanoy.mcm.edu.ph.example.finalwagecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String PW = "123";
        final String UN = "Chorizo";

        final EditText Username= findViewById(R.id.un);
        final EditText Password= findViewById(R.id.pw);
        final Button button = findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String myun = Username.getText().toString();
                        String mypw = Password.getText().toString();

                        if(mypw.equals(PW) && myun.equalsIgnoreCase(UN)) {

                            Toast.makeText(MainActivity.this, "Logged in",
                                    Toast.LENGTH_LONG).show();

                            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                            startActivity(intent);



                        }
                        else if(mypw != PW || myun != UN){
                            Toast.makeText(MainActivity.this, "incorrect",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
