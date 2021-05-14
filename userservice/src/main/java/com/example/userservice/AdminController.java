package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/addproduct")
    public ResponseEntity<?> addproduct(@RequestBody products product) {
        return ResponseEntity.ok(restTemplate.postForObject("http://localhost:8082/api/addproduct", product, RequestResponse.class));
        //.postForObject("http://localhost:8082/api/addproduct", product, RequestResponse.class));
    }
    @PostMapping("/addblog")
    public ResponseEntity<?> addblog(@RequestBody blogs blog) {
        return ResponseEntity.ok(restTemplate.postForObject("http://localhost:8090/addblog", blog, RequestResponse.class));
        //.postForObject("http://localhost:8082/api/addproduct", product, RequestResponse.class));
    }
    @PutMapping("/allproducts/{id}")
    public ResponseEntity<?> editproduct(@PathVariable Long id,@RequestBody products product) {
        restTemplate.put("http://localhost:8082/allproducts/"+id, product,RequestResponse.class );
        //("http://localhost:8082/allproducts/"+id);
        return ResponseEntity.ok("product Updated!");
    }

    //deleting product

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeproduct(@PathVariable Long id) {
        restTemplate.delete("http://localhost:8082/delete/" + id);
        return ResponseEntity.ok("Deleted product with productCode:" + id);

    }




    @PutMapping("/allblogs/{id}")
    public ResponseEntity<?> editblog(@PathVariable Long id,@RequestBody blogs product) {
        restTemplate.put("http://localhost:8090/allblogs/"+id, product,RequestResponse.class );
        //("http://localhost:8082/allproducts/"+id);
        return ResponseEntity.ok("product Updated!");
    }

    //deleting product

    /* @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeblog(@PathVariable Long id) {
        restTemplate.delete("http://localhost:8090/delete/" + id);
        return ResponseEntity.ok("Deleted product with productCode:" + id);

    } */
}
