package www.innothetechgeek.za.petmanagementapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import www.innothetechgeek.za.petmanagementapp.domain.Adoption;
import www.innothetechgeek.za.petmanagementapp.services.Adoption.AdoptionService;
import www.innothetechgeek.za.petmanagementapp.services.Adoption.impl.AdoptionImpl;

public class AdAdoption extends Activity {
    AdoptionService service = new AdoptionImpl();

    private EditText animalName;
    private EditText adopterName;
    private EditText adopterSurname;
    private EditText phonenumber;
    final Context context=this;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad_adoption_activity);


        // force connection to open
       StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
       StrictMode.setThreadPolicy(policy);


        // set button
        Button saveAdoption = (Button) findViewById(R.id.adoptions);


       saveAdoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                animalName = (EditText) findViewById(R.id.animalname);
                adopterName = (EditText) findViewById(R.id.adoptername);
                adopterSurname = (EditText) findViewById(R.id.adoptersurname);
                phonenumber = (EditText) findViewById(R.id.adopterphonenumber);

                    Adoption myAdopt = new Adoption.Builder()
                            .Animalname(animalName.getText().toString())
                            .customerName(adopterName.getText().toString())
                            .customerSurname(adopterSurname.getText().toString())
                            .phoneNumber("0833456789")
                            .build();


                    String  response = service.save(myAdopt);     // save Item

                    animalName.getText().clear();
                    adopterName.getText().clear();
                    adopterSurname.getText().clear();
                    phonenumber.getText().clear();


                    Toast.makeText(getApplicationContext(),
                            "Adoption Saved",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }

}
