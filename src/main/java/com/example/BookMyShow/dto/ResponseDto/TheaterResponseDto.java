package com.example.BookMyShow.dto.ResponseDto;

import com.example.BookMyShow.enums.TheaterType;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

//public class TheaterResponseDto {
//}
@Data
@Builder
public class TheaterResponseDto {

    @NotNull
    int id;

    String name;
    String address;
    String city;
    TheaterType type;
    //Show Entity
}