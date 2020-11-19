package org.pkg;

import io.restassured.RestAssured;
import io.restassured.assertion.BodyMatcher;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class SampleAPI {
	public static void main(String[] args) {

		RestAssured.baseURI = "https://gopi01.atlassian.net";

		Response res = RestAssured.given().header("Content-Type", "application/json").auth().preemptive().basic("gopinathan2296@gmail.com", "ml4cs8n47uXyswxMhEMrCC64")
				.when().get("/api/users/2/");

		int code = res.getStatusCode();
		System.out.println("Response code"+code);
		System.out.println();

		String body = res.getBody().asString();
		System.out.println(body);
		System.out.println(" git code updated ");

	}

}
//https://gopi01.atlassian.net/jira/software/c/projects/FAC/issues/FAC-10