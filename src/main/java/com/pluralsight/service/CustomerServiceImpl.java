package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
//import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using Constructor injection.");
        this.customerRepository = customerRepository;
    }
//    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We're using setter injection.");
        this.customerRepository = customerRepository;
    }

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
