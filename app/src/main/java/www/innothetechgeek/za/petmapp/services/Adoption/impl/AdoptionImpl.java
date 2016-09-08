package www.innothetechgeek.za.petmapp.services.Adoption.impl;

import java.util.List;


import www.innothetechgeek.za.petmapp.Repository.rest.adoption.RestAPI;
import www.innothetechgeek.za.petmapp.Repository.rest.adoption.RestAdoption;
import www.innothetechgeek.za.petmapp.domain.Adoption;
import www.innothetechgeek.za.petmapp.services.Adoption.AdoptionService;

/**
 * Created by Scorpian on 2016-08-31.
 */
public class AdoptionImpl implements AdoptionService {
    final RestAPI<Adoption,Long> rest = new RestAdoption();

    @Override
    public Adoption findById(Long id) {
        return rest.get(id);
    }

    @Override
    public String save(Adoption entity) {
        return rest.post(entity);
    }

    @Override
    public String update(Adoption entity) {
        return rest.put(entity);
    }

    @Override
    public String delete(Adoption entity) {

        return rest.delete(entity);
    }

    @Override
    public List<Adoption> findAll() {
        return rest.getAll();
    }

}
