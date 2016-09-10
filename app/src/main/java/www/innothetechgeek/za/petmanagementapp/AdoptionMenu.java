package www.innothetechgeek.za.petmanagementapp;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import www.innothetechgeek.za.petmanagementapp.domain.Adoption;
import www.innothetechgeek.za.petmanagementapp.services.Adoption.AdoptionService;
import www.innothetechgeek.za.petmanagementapp.services.Adoption.impl.AdoptionImpl;


public class AdoptionMenu extends Activity {
    AdoptionService service = new AdoptionImpl();
    Button add, delete,viewById,viewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption_menu);

        // force connection to open
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


        TextView tv = (TextView) findViewById(R.id.tv);

    add=(Button)findViewById(R.id.btnAddAdoption);
    delete=(Button)findViewById(R.id.btnDeleteAdoption);
    viewById=(Button)findViewById(R.id.btnViewAdoption);
    viewAll =  (Button) findViewById(R.id.btnViewAllAdoptions);

    final Context context=this;
    viewAll.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        List<Adoption> results =   service.findAll();

        String AdoptionToast = " ";
        for(int i=1; i<results.size(); i++){

            AdoptionToast += " ";
            String heading = "Adoption "+i+"\n";
            AdoptionToast +=  heading+"id: "+results.get(i).getId()+"\n"+"Adnimal Name:"+results.get(i).getAnimalname()+"\n"+"Adopter Name:"+results.get(i).getCustomerName()+"\n"+"Adopter Surname:"+results.get(i).getCustomerSurname()+"\n"+"Adopter Cell::"+results.get(i).getPhoneNumber()+"\n\n";
        }
        Toast.makeText(getBaseContext(), AdoptionToast, Toast.LENGTH_SHORT).show();
    }
    });

    add.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            final Intent intent = new Intent(getApplicationContext(),AdAdoption.class);
            startActivity(intent);
        }
    });

    delete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Intent intent = new Intent(getApplicationContext(), DeleteAdoption.class);
            startActivity(intent);
        }
    });

    viewById.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Intent intent = new Intent(getApplicationContext(), Search.class);
            startActivity(intent);
        }
    });
}
}
