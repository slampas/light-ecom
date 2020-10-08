package fr.baziz.lightecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import fr.baziz.lightecom.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    @RestResource(path = "/selectedProducts")
    public List<Product> findBySelectedProducts();
/*
    @RestResource(path = "/productsByKeyword")
    public List<Product> findByNameContains(String mc);
*/
}
