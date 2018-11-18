package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloLambdaFunctionCustomHandler {

	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
		String output = "Hello from Custom Handler, " + input + "!";
		return output;
	}

}
