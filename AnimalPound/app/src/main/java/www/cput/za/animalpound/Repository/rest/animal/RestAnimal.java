package www.cput.za.animalpound.Repository.rest.animal;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import www.cput.za.animalpound.domain.Animal;


/**
 * Created by Game330 on 2016-08-31.
 */
public class RestAnimal implements AnimalRestAPI<Animal, Long> {

    final String BASE_URL = "localhost:8090/";


    final HttpHeaders requestHeaders = AnimalRestMethods.getHeaders();
    final RestTemplate restTemplate = AnimalRestMethods.getRestTemplate();

    public Animal get(Long id) {

        final String url = BASE_URL+"packageproducts/" +id.toString();

        HttpEntity<Animal> requestEntity = new HttpEntity<>(requestHeaders);
        //restTemplate.getMessageConverters();
        ResponseEntity<Animal> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Animal.class);

        Animal animals = responseEntity.getBody();

        return animals;
    }

    @Override
    public String post(Animal entity) {

        final String url = BASE_URL+"Adoptions/create";
        HttpEntity<Animal> requestEntity = new HttpEntity<>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public String put(Animal entity) {

        String id = Long.toString(entity.getId());

        final String url = BASE_URL+"Adoptions/update/"+id; //.toString()
        HttpEntity<Animal> requestEntity = new HttpEntity<Animal>(entity, requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
        String result = responseEntity.getBody();
        return result;

    }

    @Override
    public String delete(Animal entity) {
        String id = Long.toString(entity.getId());
        final String url = BASE_URL+"Adoptions/delete/"+id;//.toString

        HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, String.class);

        String result = responseEntity.getBody();
        return result;
    }

    @Override
    public List<Animal> getAll() {

        List<Animal> adoptions = new ArrayList<>();
        final String url = BASE_URL+"adoptions/";
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        ResponseEntity<Animal[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Animal[].class);
        Animal[] results = responseEntity.getBody();

        for (Animal animal : results) {
            adoptions.add(animal);
        }
        return adoptions;

    }

}
