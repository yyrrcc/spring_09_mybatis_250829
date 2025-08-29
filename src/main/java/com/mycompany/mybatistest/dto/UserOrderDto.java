package com.mycompany.mybatistest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrderDto {
	private String userid;
	private String username;
	private int orderid;
	private String ordername;	
}
