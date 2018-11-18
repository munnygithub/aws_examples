package com.aws.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@DynamoDBTable(tableName = "ProductInfo")
public class ProductInfo {
	private String id;
	private String msrp;
	private String cost;

	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	@DynamoDBAttribute
	public String getMsrp() {
		return msrp;
	}

	@DynamoDBAttribute
	public String getCost() {
		return cost;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMsrp(String msrp) {
		this.msrp = msrp;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	
}