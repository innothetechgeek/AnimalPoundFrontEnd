package www.innothetechgeek.za.petmapp.Repository.rest.adoption;

import java.util.List;

import www.innothetechgeek.za.petmapp.domain.Adoption;

/**
 * Created by Game330 on 2016-08-31.
 */
public interface RestAPI<S, ID> {

    S get(ID id);

    String post(S entity);

    String put(Adoption entity);

    String delete(Adoption entity);       // doesnot implement the same, one is Getter and one is Setter
    // getter : ResourceSupport Setter Database Entity type
    List<S> getAll();
}

