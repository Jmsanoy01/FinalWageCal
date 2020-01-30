package Sanoy.mcm.edu.ph.example.finalwagecal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.lang.String;

public class Main2Activity extends AppCompatActivity {
    EditText fn;
    EditText ln;
    EditText agetxt;
    EditText idtxt;
    EditText hrstxt;

    Spinner department,sex;
    String firstname = "";
    String lastname = "";
    Button calculate;
    String hoursencoded= "";
    String age = "";
    String gender = "";
    String id = "";
    String dt;
    String sx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


                final Spinner spinner = (Spinner) findViewById(R.id.sex);
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                        R.array.gender_array, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                final Spinner spinner2 = (Spinner) findViewById(R.id.department);
                ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                        R.array.department_array, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter2);

       calculate =  findViewById(R.id.button2);

        spinner.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }

        );

        spinner2.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }


        );


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn = findViewById(R.id.fname);
                firstname = String.valueOf(fn.getText());

                ln = findViewById(R.id.lname);
                lastname = String.valueOf(ln.getText());

                agetxt = findViewById(R.id.agetxt);
                age = String.valueOf(agetxt.getText());

                idtxt = findViewById(R.id.idtxt);
                id = String.valueOf(idtxt.getText());

                hrstxt = findViewById(R.id.hrstxt);
                hoursencoded = String.valueOf(hrstxt.getText());

                String dt;
                dt=spinner.getSelectedItem().toString();

                String sx;
                sx = spinner2.getSelectedItem().toString();



            }
        });
    }

}
