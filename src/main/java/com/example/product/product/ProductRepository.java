package com.example.product.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    @Query("select p from Product p where p.gubun = :gubun")
    List<Product> findByGubun(@Param("gubun") Integer gubun);
}
