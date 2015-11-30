package com.sample.webservice.client;

public class SampleClient {
	public static void main(String[] args) {
		SampleWSImpl sampleWSImpl = new SampleWSImpl();
		ISampleWS sampleWS = sampleWSImpl.getSampleWSPort();
		String response = sampleWS.hello("Carlos Jose");
		System.out.println(response);
	}
}
