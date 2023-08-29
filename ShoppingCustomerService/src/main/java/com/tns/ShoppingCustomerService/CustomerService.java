package com.tns.ShoppingCustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService
{
	@Autowired
	private CustomerRepository repo;

	// get all the records from the table
	public List<Customer> listAll()
	{
		return repo.findAll();
	}
         // save the record in the table
	public void save(Customer cust) {
		repo.save(cust);
	}
	// retrieving the particular record with cid
	 public Customer get(Integer cid) {
		 return repo.findById(cid).get();
	 }
	 // delete the table
	 public void delete(Integer cid) {
		 repo.deleteById(cid);
	 }
}
