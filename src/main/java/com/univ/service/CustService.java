package com.univ.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.bean.Customer;
import com.univ.repository.CustRepository;

@Service
public class CustService {
	@Autowired
	public CustRepository subjectRepo;

	public List<Customer> getAlldata()
	{
		List<Customer> cust = new ArrayList<>();
		subjectRepo.findAll().forEach(cust::add);
		return cust;
	}

	public void addCust(Customer cust) {
		subjectRepo.save(cust);
		
	}
    public Customer loginCust(Customer cust)
    {
    Customer ct=subjectRepo.getLogin(cust.getUnm(),cust.getPw());
    return ct;
    }
    
	public void updateCust(String id, Customer cust) {
		subjectRepo.save(cust);
		
	}

	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
	}
}
