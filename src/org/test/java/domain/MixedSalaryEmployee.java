package org.test.java.domain;

import org.json.simple.JSONObject;
import org.test.java.json.visitor.JsonVisitor;
import org.test.java.sal.visitor.SalaryVisitor;

public class MixedSalaryEmployee extends Employee {

	private double salary;
	private int salesVolume;
	private double commission;
	
	public MixedSalaryEmployee(double commission, int salesVolume, double salary) {
		this.commission = commission;
		this.salesVolume = salesVolume;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public int getSalesVolume() {
		return salesVolume;
	}

	public double getCommission() {
		return commission;
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
