package com.example.BookMyShow.dto.ResponseDto;

import lombok.Builder;
import lombok.Data;

//public class TicketResponseDto {
//}
@Data
@Builder
public class TicketResponseDto {


    int id;

    String alloted_seats;
    double amount;

}
