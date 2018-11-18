package com.aws.dynamodb.lambda.data;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PersonRequest {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String address;
}
