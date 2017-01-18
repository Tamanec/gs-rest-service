package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people", collectionResourceDescription = @Description("some desc"))
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);

}
