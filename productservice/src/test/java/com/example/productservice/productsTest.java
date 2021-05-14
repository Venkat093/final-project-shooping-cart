package com.example.productservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class productsTest {
    @Test
    public void testSetId() {
        products products = new products();
        products.setId(123L);
        assertEquals(123L, products.getId().longValue());
    }

    @Test
    public void testSetProductname() {
        products products = new products();
        products.setProductname("Productname");
        assertEquals("Productname", products.getProductname());
    }

    @Test
    public void testSetRam() {
        products products = new products();
        products.setRam("Ram");
        assertEquals("Ram", products.getRam());
    }

    @Test
    public void testSetRom() {
        products products = new products();
        products.setRom("Rom");
        assertEquals("Rom", products.getRom());
    }

    @Test
    public void testSetWeight() {
        products products = new products();
        products.setWeight("Weight");
        assertEquals("Weight", products.getWeight());
    }

    @Test
    public void testSetPublisher() {
        products products = new products();
        products.setPublisher("Publisher");
        assertEquals("Publisher", products.getPublisher());
    }

    @Test
    public void testSetListprice() {
        products products = new products();
        products.setListprice(10000.0);
        assertEquals(10000.0, products.getListprice());
    }

    @Test
    public void testSetImg() {
        products products = new products();
        products.setImg("Img");
        assertEquals("Img", products.getImg());
    }

    @Test
    public void testSetDiscription() {
        products products = new products();
        products.setDiscription("Discription");
        assertEquals("Discription", products.getDiscription());
    }

    @Test
    public void testSetBrand() {
        products products = new products();
        products.setBrand("Brand");
        assertEquals("Brand", products.getBrand());
    }




    
}

