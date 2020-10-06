package fr.baziz.lightecom.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.baziz.lightecom.entities.Category;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CategoryRepository extends  JpaRepository<Category, Long> {
    





    
}

