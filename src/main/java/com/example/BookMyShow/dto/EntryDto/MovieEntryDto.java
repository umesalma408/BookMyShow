package com.example.BookMyShow.dto.EntryDto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MovieEntryDto {
    //Dtos are built to avoid heavy api calling bcz they contain only required parameters
    String name;

    @NotNull
    LocalDate releaseDate;
}

