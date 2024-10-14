package com.example.ProjectLaptopStore.DTO;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User_LoginDTO {
    String phoneNumber;
    String password;
}
