package br.com.mtisi.course.contorller;


import br.com.mtisi.course.entities.Category;
import br.com.mtisi.course.entities.Order;
import br.com.mtisi.course.services.CategoryService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<Category>> findall(){
        List<Category> List = categoryService.findAll();
        return ResponseEntity.ok().body(List);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Category> fingById(@PathVariable Long id){
        Category category = categoryService.findById(id);
        return ResponseEntity.ok(category);
    }


}
