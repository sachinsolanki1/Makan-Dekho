package com.univ.repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.univ.bean.Customer;

public interface CustRepository extends CrudRepository<Customer,String> {
	@Query("select c from Customer c where c.unm=?1 AND c.pw=?2")
	public Customer getLogin(String unm,String pw);

}
