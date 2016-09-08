package www.innothetechgeek.za.petmapp.factory.adoption;


import www.innothetechgeek.za.petmapp.domain.Adoption;

/**
 * Created by Bonga on 9/3/2016.
 */


public class AdoptionFactory {

    public static Adoption getAdoption( long id, String animalName, String customerName, String customerSurname,String phonenumber)
    {

        {
            Adoption myAdopt = new Adoption.Builder()
                    .id(id)
                    .animalName(animalName)
                    .customerName(customerName)
                    .customerSurname(customerSurname)
                    .phoneNumber(phonenumber)
                    .build();
            return myAdopt;
        }
    }


}
