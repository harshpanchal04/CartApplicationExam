package com.example.cartapplication.controllers;

import com.example.cartapplication.DTOs.FakeSingleCartDto;
import com.example.cartapplication.services.AllCartDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllCartsDetails {
    AllCartDetailService AllCartsObject ;
    GetAllCartsDetails(AllCartDetailService ACDetailsObject){
      this.AllCartsObject = ACDetailsObject;
    };

    @GetMapping("/carts")
    public FakeSingleCartDto[] GetACDetails(){
        return AllCartsObject.GetACDetails();
    }


}
