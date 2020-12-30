package org.test.java.domain;

import org.json.simple.JSONObject;
import org.test.java.json.visitor.JsonVisitor;
import org.test.java.sal.visitor.SalaryVisitor;

public class FixedSalaryEmployee extends Employee {

	private double salary;
	
	public FixedSalaryEmployee(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public double accept(SalaryVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public JSONObject accept(JsonVisitor visitor) {
		return visitor.visit(this);
	}

}
