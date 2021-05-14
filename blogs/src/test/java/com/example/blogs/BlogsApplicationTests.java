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


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

@SpringBootTest(classes=BlogsApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class BlogsApplicationTests {

	@Autowired
	public TestRestTemplate restTemplate;

	@LocalServerPort
	public int port;

	public String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void createBlog() {
		blogs blog = new blogs();
		blog.setDiscription("asdfghjkl asdfghjkl asdfghjkl asdfghjkl");
		blog.setHeadline("oneplus");
		blog.setId((long) 1);
		blog.setImg("asdfghjk");
		blog.setProductname("oneplus 9");
		ResponseEntity<blogs> postResponse = restTemplate.postForEntity("http://localhost:8090/addblog", blog, blogs.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	@Test
	public void blogbyId() {
		blogs blog = restTemplate.getForObject(getRootUrl() + "/allblogs/1", blogs.class);
		assertNotNull(blog);
	}

	@Test
	public void testGetAllblogs() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/allblogs",
				HttpMethod.GET, entity, String.class);
		assertNotNull(response.getBody());
	}

	@Test
	public void testDeleteEmployee() {
		int id = 2;
		blogs blog=restTemplate.getForObject(getRootUrl()+"/delete/"+id,blogs.class);
		assertNotNull(blog);
		restTemplate.delete(getRootUrl() + "/delete/" + id);
		try {
			blog = restTemplate.getForObject(getRootUrl() + "/delete/" + id, blogs.class);
		} catch (final HttpClientErrorException e) {
			assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
		}
	}



}
