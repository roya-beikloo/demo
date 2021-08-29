package com.ecommerce.shop.validation.response;

import lombok.Data;

/**
 * Created Roya gh Stamps on 8/26/2021
 */
@Data
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String account;
    private String name;
    private String role;

    public JwtResponse(String token, String account, String name, String role) {
        this.account = account;
        this.name = name;
        this.token = token;
        this.role = role;
    }
}
