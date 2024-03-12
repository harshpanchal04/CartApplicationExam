package com.example.cartapplication.services;

import com.example.cartapplication.DTOs.FakeSingleCartDto;
import com.example.cartapplication.controllers.GetSingleCartDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SingleCartService {
    RestTemplate GetServerSCDetails = new RestTemplate();
    String ServerURL = "https://fakestoreapi.com/carts/";
    public FakeSingleCartDto GetSCartDetails(Long id){
        var ServerResponse = GetServerSCDetails.getForObject(ServerURL+id, FakeSingleCartDto.class);
        return ServerResponse;
    }

}
