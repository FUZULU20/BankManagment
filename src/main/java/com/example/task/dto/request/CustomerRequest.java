package com.example.task.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private Long customerID;
    private String fname;
    private String lname;
    private String address;
    private String contactAdd;
    private String username;
    private String password;
}
