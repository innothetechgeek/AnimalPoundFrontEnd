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
public class DeleteAdoption extends Activity {
    private EditText adoptionId;
    AdoptionService service = new AdoptionImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_activity);
                // force connection to open
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


        adoptionId = (EditText) findViewById(R.id.lblAdoptionIdDelete);
        Button deleteAdoptom = (Button) findViewById(R.id.btnDeleteOne);

        deleteAdoptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adoptionId = (EditText) findViewById(R.id.lblAdoptionIdDelete);

                Adoption myAdopt = new Adoption.Builder()
                        .id(Long.parseLong(adoptionId.getText().toString()))
                        .build();
                String response = service.delete(myAdopt);
                Toast.makeText(getBaseContext(), "Adoption Deleted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
