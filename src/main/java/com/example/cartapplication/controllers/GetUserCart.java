package com.example.cartapplication.controllers;

import com.example.cartapplication.DTOs.FakeSingleCartDto;
import com.example.cartapplication.services.AllCartDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserCart {
    AllCartDetailService GetUCObject;
    GetUserCart(AllCartDetailService UCDetailsObject){
        this.GetUCObject = UCDetailsObject;
    }

    @GetMapping("/carts/user/{id}")
    public FakeSingleCartDto[] GetUserCartsDetails(@PathVariable Long id){
        return GetUCObject.GetUserCartsDetails(id);
    }

}
