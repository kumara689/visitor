package org.test.java.domain;

import org.json.simple.JSONObject;
import org.test.java.json.visitor.JsonVisitor;
import org.test.java.sal.visitor.SalaryVisitor;

public class CommissionBasedEmployee extends Employee {

	private int salesVolume;
	private double commission;
	
	public CommissionBasedEmployee(double commission, int salesVolume) {
		this.salesVolume = salesVolume;
		this.commission = commission;
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
