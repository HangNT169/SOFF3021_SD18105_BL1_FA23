package com.poly.hangnt169.sof3021.B10_JPA.service.impl;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import com.poly.hangnt169.sof3021.B10_JPA.repository.CategoryRepository;
import com.poly.hangnt169.sof3021.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public List<Category> getAll() {
        return repo.findAll(); // tra ra 1 list du lieu
        // get all => findAll
        // add/update
//        repo.save(Doi tung can add)
        // delete
//        repo.delete(Doi tuong muon xoa);
//        repo.deleteById(Id cua doi tuong muon xoa);
        // get one
//        repo.getOne(ID) // Cach cu
//        repo.findById(ID).get(); Cach moi
    }

    @Override
    public void add(Category category) {
        repo.save(category);
    }
}
