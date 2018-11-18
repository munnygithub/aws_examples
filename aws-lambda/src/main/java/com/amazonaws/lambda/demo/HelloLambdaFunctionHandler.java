package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambdaFunctionHandler implements RequestHandler<Object, String> {

	@Override
	public String handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
		String output = "Hello from RequestHandler, " + input + "!";
		return output;
		
		
	}

}
