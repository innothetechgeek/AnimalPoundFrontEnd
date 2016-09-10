package www.innothetechgeek.za.petmanagementapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import www.innothetechgeek.za.petmanagementapp.domain.Adoption;
import www.innothetechgeek.za.petmanagementapp.services.Adoption.AdoptionService;
import www.innothetechgeek.za.petmanagementapp.services.Adoption.impl.AdoptionImpl;

/**
 * Created by Game330 on 2016-09-07.
 */
public class Search extends Activity {

    AdoptionService service = new AdoptionImpl();

    private EditText id;
    private Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_one_activity);
        // force connection to open
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        delete = (Button) findViewById(R.id.btnSearch);
        id = (EditText) findViewById(R.id.lblIdToSearch);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AdoptionToast = " ";
                Adoption adoption =   service.findById(Long.parseLong(id.getText().toString()));


                    AdoptionToast = "id: "+"i"+adoption.getId()+"\n"+"Adnimal Name:"+adoption.getAnimalname()+"\n"+"Adopter Name:"+adoption.getCustomerName()+"\n"+"Adopter Surname:"+adoption.getCustomerSurname()+"\n"+"Adopter Cell::"+adoption.getPhoneNumber()+"\n\n";

                Toast.makeText(getBaseContext(), AdoptionToast, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
