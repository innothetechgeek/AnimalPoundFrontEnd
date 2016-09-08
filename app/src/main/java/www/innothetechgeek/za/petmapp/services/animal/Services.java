package www.innothetechgeek.za.petmapp.services.animal;

import java.util.List;

import www.innothetechgeek.za.petmapp.domain.Adoption;
import www.innothetechgeek.za.petmapp.domain.Animal;

/**
 * Created by Scorpian on 2016-08-31.
 */
public interface Services<H, ID> {

    public H findById(ID id);

    public String save(H entity);

    public String update(Animal entity);

    public String delete(Animal entity); // Getter, GET implements Resource Support, Post Supports Entity model

    public List<H> findAll();

}