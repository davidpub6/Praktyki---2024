package com.example.demo.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Product product = productRepo.findById(id).orElseThrow();
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        return productRepo.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepo.deleteById(id);
    }

    @GetMapping("/count")
    public Long getCountProducts() {
        return productRepo.countProducts();
    }
    
}
