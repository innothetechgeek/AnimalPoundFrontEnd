package www.innothetechgeek.za.petmapp.domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-08-31.
 */
public class Adoption implements Serializable {

    private long id;
    private  String animalName;
    private  String customerName;
    private  String customerSurname;
    private String phoneNumber;

    public long getId() {
        return id;
    }

    public String getAnimalName(){
        return animalName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerSurname(){
        return customerSurname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Adoption()
    {

    }

    public Adoption(Builder builder) {
        id = builder.id;
        animalName = builder.animalName;
        customerName = builder.customerName;
        customerSurname = builder.customerSurname;
        phoneNumber = builder.phoneNumber;

    }
    public static class Builder {
        //Equivalent to setters
        private long id;
        private String animalName;
        private String customerName;
        private String customerSurname;
        private String phoneNumber;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder animalName(String animalName) {
            this.animalName = animalName; //compulsary
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
            this.animalName = adoption.getAnimalName();
            this.customerName = adoption.getCustomerName();
            this.customerSurname = adoption.getCustomerSurname();
            this.phoneNumber = adoption.phoneNumber;

            return this;
        }
        public Adoption build() {
            return new Adoption(this);
        }
    }

    public String toString()
    {
        return String.format("Id : %d\ncustomerName :%s\nanimalName :%s\ncustomerName :%s\ndate",id,customerName,customerSurname,phoneNumber);
    }


}
