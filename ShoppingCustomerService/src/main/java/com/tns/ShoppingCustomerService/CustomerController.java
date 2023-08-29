package com.tns.ShoppingCustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CustomerController
{
	@Autowired
	private CustomerService service;

	@GetMapping("/customerservice")
	public List<Customer> list(){

		return service.listAll();
	}
	@PostMapping("/customerservice")
	public void add(@RequestBody Customer cust) {
		service.save(cust);
	}
	@PutMapping("/customerservice")
	public ResponseEntity<?> update(@RequestBody Customer cust)
	{
		service.save(cust);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}
	@GetMapping("/customerservice/{cid}")
	public ResponseEntity<Customer> get(@PathVariable Integer cid)
	{
		try
		{
			Customer cust=service.get(cid);
			return new ResponseEntity<Customer>(cust, HttpStatus.OK);
		}
		catch (NoResultException e)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/customerservice/{cid}")
	public void delete(@PathVariable Integer cid) {
		service.delete(cid);
	}
}
