package org.test.java.json.visitor;

import org.json.simple.JSONObject;
import org.test.java.domain.CommissionBasedEmployee;
import org.test.java.domain.FixedSalaryEmployee;
import org.test.java.domain.MixedSalaryEmployee;

public interface JsonVisitor {

	JSONObject visit(FixedSalaryEmployee fixedSalary);
	JSONObject visit(CommissionBasedEmployee commisionBasedSalary);
	JSONObject visit(MixedSalaryEmployee mixedSalary);
	
}
