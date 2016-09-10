package www.innothetechgeek.za.petmanagementapp.services.Adoption;

import java.util.List;

import www.innothetechgeek.za.petmanagementapp.domain.Adoption;


/**
 * Created by Scorpian on 2016-08-31.
 */
public interface Services<H, ID> {

    public H findById(ID id);

    public String save(H entity);

    public String update(Adoption entity);

    public String delete(Adoption entity); // Getter, GET implements Resource Support, Post Supports Entity model

    public List<H> findAll();

}