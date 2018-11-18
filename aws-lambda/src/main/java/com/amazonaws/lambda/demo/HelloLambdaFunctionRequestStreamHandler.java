package com.amazonaws.lambda.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;

public class HelloLambdaFunctionRequestStreamHandler implements RequestStreamHandler {

	@Override
	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

		String input = IOUtils.toString(inputStream);
		outputStream.write(("Hello World from RequestStreamHandler - " + input).getBytes());
	}
}
