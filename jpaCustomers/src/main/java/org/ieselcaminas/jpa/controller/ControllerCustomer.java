package org.ieselcaminas.jpa.controller;

import ch.qos.logback.core.model.Model;
import org.ieselcaminas.jpa.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerCustomer {
    // Dependncias
    private final CustomerRepository customerRepository;
    ControllerCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping
    public String inicio(Model model){
        return "index";
    }
}
