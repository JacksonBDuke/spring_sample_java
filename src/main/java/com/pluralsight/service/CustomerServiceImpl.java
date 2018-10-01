package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    /*
	    Alternate with below @Autowired tag to change between.
	 */
//    @Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

    }

	public CustomerServiceImpl(CustomerRepository customerRepository) {
	    System.out.println("Using constructor injection");
		this.customerRepository = customerRepository;
	}

	/*
	    Alternate with above @Autowired tag to change between.
	 */
    @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection");
        this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
