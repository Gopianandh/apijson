package org.pkg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Apitask {
public static void main(String[] args) throws IOException, ParseException {

	FileReader  fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Newfolder\\sample.json");
	
	JSONParser js = new JSONParser();
	
	Object parse = js.parse(fr);
	
	JSONObject jOBj = (JSONObject)parse;
	System.out.println(jOBj.get("total").toString());
	

	
	Object obj = jOBj.get("ad");
	
	JSONObject jOb = (JSONObject)obj;
	
	System.out.println(jOb.get("company").toString());
	
	System.out.println(jOb.get("url").toString());
	
	System.out.println(jOb.get("text").toString());
	
	Object object = jOBj.get("data");
	
	JSONArray jSa = (JSONArray)object;
	
	Object obj2 = jSa.get(4);
	
	
	
	
	
	JSONObject j = (JSONObject)obj2;
	
	System.out.println(j.get("id").toString());
	
	Object object2 = jSa.get(2);
	
	JSONObject json = (JSONObject)object2;
	System.out.println(json.get("first_name").toString());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
