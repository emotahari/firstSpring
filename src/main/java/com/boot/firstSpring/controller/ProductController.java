package com.boot.firstSpring.controller;
import com.boot.firstSpring.Service.ProductService;
import com.boot.firstSpring.entity.Product;
import com.boot.firstSpring.repo.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductRepository productRepository;
    @GetMapping("/hello")
    public String hello() {
        return "helloo";
    }

    private final ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }


    // Create a new product
//    @PostMapping("/product")
//    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
//    {
//        Product newProduct = productRepository.save(product);
//        return ResponseEntity.ok(newProduct);
//    }

    // Create a new product
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        Product newProduct = productRepository.save(product);
        return ResponseEntity.ok(newProduct);
    }


    // Get all products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return  productRepository.findAll();
    }


    // Get a product by ID
//    @GetMapping("/products/{id}")
//    public ResponseEntity<Product> getProductById(@PathVariable Long id)
//    {
//        Product product = productService.getProductById(id);
//        if (product != null) {
//            return ResponseEntity.ok(product);
//        }
//        else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}