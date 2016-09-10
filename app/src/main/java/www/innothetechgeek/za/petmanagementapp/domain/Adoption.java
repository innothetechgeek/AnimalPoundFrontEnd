package www.innothetechgeek.za.petmanagementapp.domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-08-31.
 */
public class Adoption implements Serializable {
    //NB: I've not forgotten the principles that we learned at the beginning of the year,
    //my cloud server doesn't allow Pascal Casing.
    private long id;
    private String animalname;

    private String adoptername;
    private String adoptersurname;
    private String phonenumber;


    public long getId() {
        return id;
    }

    public String getAnimalname(){
        return animalname;
    }
    public String getCustomerName(){
        return adoptername;
    }
    public String getCustomerSurname(){
        return adoptersurname;
    }
    public String getPhoneNumber() {
        return phonenumber;
    }

    public Adoption()
    {

    }

    public Adoption(Builder builder) {
        id = builder.id;
        animalname = builder.Animalname;
        adoptername = builder.customerName;
        adoptersurname = builder.customerSurname;
        phonenumber = builder.phoneNumber;

    }
    public static class Builder {
        //Equivalent to setters
        private long id;
        private String Animalname;
        private String customerName;
        private String customerSurname;
        private String phoneNumber;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder () {

        }

        public Builder Animalname(String Animalname) {
            this.Animalname = Animalname; //compulsary
            return this;
        }
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerSurname(String customerSurname) {
            this.customerSurname = customerSurname;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder copy(Adoption adoption){
            this.id = adoption.getId();
            this.Animalname = adoption.getAnimalname();
            this.customerName = adoption.getCustomerName();
            this.customerSurname = adoption.getCustomerSurname();
            this.phoneNumber = adoption.getPhoneNumber();

            return this;
        }
        public Adoption build() {
            return new Adoption(this);
        }
    }

    public String toString()
    {
        return String.format("Id : %d\ncustomerName :%s\nAnimalname :%s\ncustomerName :%s\ndate",id,adoptername,adoptersurname,phonenumber);
    }


}
