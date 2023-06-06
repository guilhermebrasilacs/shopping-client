package com.project5.ACSchapter8.shoppingclient.dto;

import	lombok.AllArgsConstructor;
import	lombok.Getter;
import	lombok.NoArgsConstructor;
import	lombok.Setter;
import	java.time.LocalDateTime;

@Setter
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class ErrorDTO {
    private int status;
    private String message;
    private LocalDateTime timestamp;
}
