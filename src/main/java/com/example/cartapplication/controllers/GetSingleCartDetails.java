package com.example.cartapplication.controllers;

import com.example.cartapplication.DTOs.FakeSingleCartDto;
import com.example.cartapplication.services.SingleCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSingleCartDetails {
    SingleCartService SingleServiceObject ;
    GetSingleCartDetails(SingleCartService SCObject){
        this.SingleServiceObject = SCObject;
    }
    @GetMapping("/carts/{id}")
    public FakeSingleCartDto GetSCartDetails(@PathVariable Long id){
        return SingleServiceObject.GetSCartDetails(id);
    }
}
