package org.test.java.json.visitor;

import org.json.simple.JSONObject;

public interface JsonVisitable {

	JSONObject accept(JsonVisitor visitor);
	
}
