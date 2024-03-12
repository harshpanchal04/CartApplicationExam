package com.example.cartapplication.services;

import com.example.cartapplication.DTOs.FakeSingleCartDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Getter
@Setter
@Service
public class AllCartDetailService {
    RestTemplate AllCartsDetailsWeb = new RestTemplate();
    String ServerURL = "https://fakestoreapi.com/carts";

    public FakeSingleCartDto[] GetACDetails(){
        var ServerResponse = AllCartsDetailsWeb.getForObject(ServerURL, FakeSingleCartDto[].class);
        return ServerResponse;
    }

    public FakeSingleCartDto[] GetUserCartsDetails(Long id){
        FakeSingleCartDto[] AllCartsData = AllCartsDetailsWeb.getForObject(ServerURL, FakeSingleCartDto[].class);
        int TotalNumsOfCart=0;
        //Getting length of required user carts.
        for(int i=0;i<AllCartsData.length;i++){
            FakeSingleCartDto currentCart = AllCartsData[i];
            if(currentCart.getUserId() == id){
                TotalNumsOfCart++;
            }
        }

        int index = 0;
        FakeSingleCartDto[] RequiredUserData = new FakeSingleCartDto[TotalNumsOfCart];
        for(int i=0;i<AllCartsData.length;i++){
            FakeSingleCartDto currentCart = AllCartsData[i];
            if(currentCart.getUserId() == id){
                RequiredUserData[index] = currentCart;
                index++;
            }
        }
        return RequiredUserData;
    }
    
}
