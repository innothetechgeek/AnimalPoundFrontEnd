package www.innothetechgeek.za.petmanagementapp.Repository.rest.animal;

import java.util.List;

import www.innothetechgeek.za.petmanagementapp.domain.Animal;


/**
 * Created by Game330 on 2016-08-31.
 */
public interface AnimalRestAPI<S, ID> {

    S get(ID id);

    String post(S entity);

    String put(Animal entity);

    String delete(Animal entity);       //
    // doesnot implement the same, one is Getter and one is Setter
    // getter : ResourceSupport Setter Database Entity type
    List<S> getAll();
}

