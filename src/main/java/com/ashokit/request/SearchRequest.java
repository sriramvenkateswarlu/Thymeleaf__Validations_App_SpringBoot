package com.ashokit.request;

import lombok.Data;

@Data
public class SearchRequest {

	private String name;
	private Double price;
	private Integer quantity;
}
