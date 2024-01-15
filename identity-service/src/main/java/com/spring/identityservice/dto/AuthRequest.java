package com.spring.identityservice.dto;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 15 Jan 2024
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String username;
    private String password;

}
