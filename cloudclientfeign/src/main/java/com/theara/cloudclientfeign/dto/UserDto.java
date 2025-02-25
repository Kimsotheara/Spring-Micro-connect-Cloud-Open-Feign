package com.theara.cloudclientfeign.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
