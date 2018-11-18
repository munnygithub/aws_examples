package com.aws.dynamodb.lambda.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
	private int id;
	private String name;

	public Person(String json) {
		Gson gson = new Gson();
		Person request = gson.fromJson(json, Person.class);
		this.id = request.getId();
		this.name = request.getName();
	}

	public String toString() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}
}