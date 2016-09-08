package www.innothetechgeek.za.petmapp.factory.animal;


import www.innothetechgeek.za.petmapp.domain.Animal;

/**
 * Created by Game330 on 2016-09-07.
 */
public class AnimalFactory {
    private long id;
    private String breed;
    private String name;
    private String livingArea;

    public static Animal getAdoption(long id, String breed, String livingArea, String name)
    {
        {
            Animal animal = new Animal.Builder()
                    .id(id)
                    .breed(breed)
                    .livingArea(livingArea)
                    .name(name)
                    .livingArea(livingArea)
                    .build();
            return animal;
        }
    }
}
