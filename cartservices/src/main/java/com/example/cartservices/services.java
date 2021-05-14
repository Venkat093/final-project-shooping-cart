package com.example.cartservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class services {
    @Autowired
    private cartRepository repo;
    @Autowired 
    private repository repository;

  



    public void addtocart(Long id,cartitems cart,String Username)
    {
        products product =repository.findById(id).orElse(null);
        cart.setProductid(product.getId());
        cart.setSubtotal(product.getListprice());
        cart.setUsername(Username);
        repo.save(cart);
    }
}
