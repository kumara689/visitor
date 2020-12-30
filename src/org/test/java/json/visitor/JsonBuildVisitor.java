package org.test.java.json.visitor;

import org.test.java.domain.CommissionBasedEmployee;
import org.test.java.domain.Employee;
import org.test.java.domain.FixedSalaryEmployee;
import org.test.java.domain.MixedSalaryEmployee;
import org.json.simple.JSONObject;    

public class JsonBuildVisitor implements JsonVisitor{

	@Override
	public JSONObject visit(FixedSalaryEmployee fixedSalary) {
		JSONObject obj=new JSONObject();   
		setNameAgeAddress(obj, fixedSalary);
	    obj.put("salary",fixedSalary.getSalary());
		return obj;
	}

	@Override
	public JSONObject visit(CommissionBasedEmployee commisionBasedSalary) {
		JSONObject obj=new JSONObject();    
		setNameAgeAddress(obj, commisionBasedSalary);
	    obj.put("commission",commisionBasedSalary.getCommission());
	    obj.put("sales",commisionBasedSalary.getSalesVolume());
		return obj;
	}

	@Override
	public JSONObject visit(MixedSalaryEmployee mixedSalary) {
		JSONObject obj=new JSONObject();     
		setNameAgeAddress(obj, mixedSalary);
	    obj.put("salary",mixedSalary.getSalary());
	    obj.put("commission",mixedSalary.getCommission());
	    obj.put("sales",mixedSalary.getSalesVolume());
		return obj;
	}

	private void setNameAgeAddress(JSONObject obj, Employee e) {
		obj.put("name",e.getName());    
		obj.put("age",e.getAge());    
		obj.put("address",e.getAddress());
	}
	
}
