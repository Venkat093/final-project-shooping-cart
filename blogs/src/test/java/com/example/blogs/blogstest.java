package com.example.blogs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = BlogsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)

class blogsTest {
	@Test
	public void testSetId() {
		blogs blogs = new blogs();
		blogs.setId(123L);
		assertEquals(123L, blogs.getId().longValue());
	}

	@Test
	public void testSetProductname() {
		blogs blogs = new blogs();
		blogs.setProductname("Productname");
		assertEquals("Productname", blogs.getProductname());
	}

	@Test
	public void testSetHeadline() {
		blogs blogs = new blogs();
		blogs.setHeadline("Headline");
		assertEquals("Headline", blogs.getHeadline());
	}

	@Test
	public void testSetImg() {
		blogs blogs = new blogs();
		blogs.setImg("Img");
		assertEquals("Img", blogs.getImg());
	}

	@Test
	public void testSetDiscription() {
		blogs blogs = new blogs();
		blogs.setDiscription("Discription");
		assertEquals("Discription", blogs.getDiscription());
	}
}


