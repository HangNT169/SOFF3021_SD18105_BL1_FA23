package com.poly.hangnt169.sof3021.B10_JPA.repository;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // CRUD tren 1 bang => Khong can phan viet
    // Custom SQL
    // Co 2 de custom SQL
    // c1: Query creation
    // c2: Raw SQL

    Category findCategoryById1AndAndCategoryCode(Long id, String categoryCode);

    // Bo Category cung duoc
    // Category findByCategoryCodeAndId1(String categoryCode, Long id);

    // C2: raw SQL
    // 1. Native Query => Truy van tren SQL
    // 2. JPQL => Truy van tren thuc the <=> Tuong tu HQL

    // 1. Native = true  => Truy van SQL
    @Query(value = "SELECT c FROM category c where c.category_name = ?1 AND c.category_code = ?2 "
            , nativeQuery = true)
    List<Category> searchName(String name, String code);

    // 2. JPQL
    @Query("SELECT c FROM Category c WHERE c.categoryName = ?2 AND c.categoryCode = ?1")
    List<Category> searchName1(String code, String name);

}
