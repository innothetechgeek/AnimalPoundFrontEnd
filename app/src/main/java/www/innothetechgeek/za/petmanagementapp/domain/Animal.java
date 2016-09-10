package www.innothetechgeek.za.petmanagementapp.domain;

import java.io.Serializable;

/**
 * Created by Game330 on 2016-08-31.
 */

public class Animal implements Serializable {
    private long id;
    private String breed;
    private String livingArea;
    private String name;


    public Animal() {

    }

    private Animal(Builder build) {
        this.breed = build.breed;
        this.livingArea = build.livingArea;
        this.name = build.name;
        this.id = build.id;
    }

    public long getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public String getlivingArea() {
        return livingArea;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private long id;
        private String breed;
        private String livingArea;
        private String name;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder livingArea(String livingArea) {
            this.livingArea = livingArea;
            return this;
        }

        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder animal(Animal animal) {
            name = animal.getName();
            breed = animal.getBreed();
            livingArea = animal.getlivingArea();
            id = animal.getId();
            return this;
        }

        public Builder copy(Animal value) {
            name = value.name;
            breed = value.breed;
            livingArea = value.livingArea;
            id = value.id;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }


    /*
    @Override
    public String toString()
    {
        return String.format("Id : %d\nName :%s\nSurname :%s\nAge :%s",id,name,surname,age);

    }

    */
}

