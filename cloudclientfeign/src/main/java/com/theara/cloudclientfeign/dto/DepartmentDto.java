package com.theara.cloudclientfeign.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DepartmentDto {
    private Long id;
    private String name;
    private String address;
    private String code;
}
