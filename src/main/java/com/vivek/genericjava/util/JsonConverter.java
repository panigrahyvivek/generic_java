package com.vivek.genericjava.util;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vivek.genericjava.Models.Employee;

public class JsonConverter {
    
    private Gson gson = null;
    
    public JsonConverter() {
    	try {
			System.out.println("gson object created");
			gson = new GsonBuilder().create();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

    public String convertToJson(List<Employee> collection) {
        
        String jarray = gson.toJson(collection);
        return jarray;
    }
}	