package com.hellographql.demo.controller;


import com.hellographql.demo.entity.Customer;
import com.hellographql.demo.entity.CustomerInput;
import com.hellographql.demo.repository.CustomerRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @QueryMapping
    public Iterable<Customer> customers(){
        return this.customerRepository.findAll();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id){
        return this.customerRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public Customer customerByEmail(@Argument String email){
        return this.customerRepository.findCustomerByEmail(email);
    }

    @MutationMapping
    public Customer addCustomer(@Argument(name="input") CustomerInput customerInput){
        return this.customerRepository.save(customerInput.getCustomerEntity());
    }
}
