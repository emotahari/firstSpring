package com.boot.firstSpring.controller;
import com.boot.firstSpring.Service.ProductService;
import com.boot.firstSpring.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/api/v1")
@RestController
public class ProductController {

    @GetMapping("/hello")
    public String hello() {
        return "Hellotesto";
    }
}
//    private final ProductService productService;
//
//    public ProductController(ProductService productService)
//    {
//        this.productService = productService;
//    }
//
//    // Create a new product
////    @PostMapping("/product")
////    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
////    {
////        Product newProduct = productRepository.save(product);
////        return ResponseEntity.ok(newProduct);
////    }
//
//
//    // Get all products
//    @GetMapping("/products")
//    public List<Product> getAllProducts()
//    {
//        return (List<Product>) productService.fetchAllProducts();
//    }
//
//    // Get a product by ID
////    @GetMapping("/products/{id}")
////    public ResponseEntity<Product> getProductById(@PathVariable Long id)
////    {
////        Product product = productService.getProductById(id);
////        if (product != null) {
////            return ResponseEntity.ok(product);
////        }
////        else {
////            return ResponseEntity.notFound().build();
////        }
////    }
