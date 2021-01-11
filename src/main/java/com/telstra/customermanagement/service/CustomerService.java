package com.telstra.customermanagement.service;

import com.telstra.customermanagement.entity.Customer;
import com.telstra.customermanagement.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public String deleteCustomer(Long id) {
        try {
            customerRepository.deleteById(id);
            return "delete successful";
        } catch (Exception e) {
            return "delete unsuccessful";
        }
    }
}
