package www.innothetechgeek.za.petmapp.services.animal.impl;

import java.util.List;

import www.innothetechgeek.za.petmapp.Repository.rest.animal.AnimalRestAPI;
import www.innothetechgeek.za.petmapp.Repository.rest.animal.RestAnimal;
import www.innothetechgeek.za.petmapp.domain.Animal;
import www.innothetechgeek.za.petmapp.services.animal.AnimalService;

/**
 * Created by Scorpian on 2016-08-31.
 */
public class AnimalServiceImpl implements AnimalService {
    final AnimalRestAPI<Animal,Long> rest = new RestAnimal();

    @Override
    public Animal findById(Long id) {
        return rest.get(id);
    }

    @Override
    public String save(Animal entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Animal entity) {
        return rest.put(entity);
    }

    @Override
    public String delete(Animal entity) {

        return rest.delete(entity);
    }

    @Override
    public List<Animal> findAll() {
        return rest.getAll();
    }

}
