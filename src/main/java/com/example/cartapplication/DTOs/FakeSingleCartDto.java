package com.example.cartapplication.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FakeSingleCartDto {
    Long id;
    Long userId;
    LocalDateTime date;
//    DateTimeFormatter date;
    Product[] products;
}
