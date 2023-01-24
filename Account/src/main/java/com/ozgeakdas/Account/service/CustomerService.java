package com.ozgeakdas.Account.service;

import com.ozgeakdas.Account.exception.CustomerNotFoundException;
import com.ozgeakdas.Account.model.Customer;
import com.ozgeakdas.Account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer could not find by id: "+ id));
    }
}
