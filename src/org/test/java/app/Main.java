package org.test.java.app;

import org.json.simple.JSONArray;
import org.test.java.domain.CommissionBasedEmployee;
import org.test.java.domain.Employee;
import org.test.java.domain.FixedSalaryEmployee;
import org.test.java.domain.MixedSalaryEmployee;
import org.test.java.json.visitor.JsonBuildVisitor;
import org.test.java.sal.visitor.SalaryCalcVisitor;

public class Main {

	public static void main(String[] args) {
		
		Employee a = new FixedSalaryEmployee(7500);
		a.setName("Wanarathana");
		a.setAddress("Wanduraba");
		a.setAge(30);
		
		Employee b = new FixedSalaryEmployee(8000);
		b.setName("Zxel");
		b.setAddress("Nz");
		b.setAge(40);
		
		Employee c = new CommissionBasedEmployee(50, 100);
		c.setName("Maxwell");
		c.setAddress("Australia");
		c.setAge(25);
		
		Employee d = new CommissionBasedEmployee(60, 150);
		d.setName("Miles");
		d.setAddress("Colombo");
		d.setAge(22);
		
		Employee e = new MixedSalaryEmployee(50, 70, 1500);
		e.setName("Sisilton");
		e.setAddress("Tholangamuwa");
		e.setAge(33);
		
		Employee f = new MixedSalaryEmployee(50, 70, 2000);
		f.setName("Manel");
		f.setAddress("Colombo");
		f.setAge(35);
		
		Employee g = new MixedSalaryEmployee(70, 80, 1500);
		g.setName("Sewwandi");
		g.setAddress("Australia");
		g.setAge(30);
		
		Employee h = new MixedSalaryEmployee(10, 200, 1000);
		h.setName("Jasmine");
		h.setAddress("Singapore");
		h.setAge(40);
		
		Employee[] employees = new Employee[]{a,b,c,d,e,f,g,h};
		
		SalaryCalcVisitor salVisitor = new SalaryCalcVisitor();
		
		double totalSalaryOfAllEmployees = 0.0d;
		for(int i = 0; i < employees.length; i++) {
			totalSalaryOfAllEmployees = totalSalaryOfAllEmployees + employees[i].accept(salVisitor);
		}
		
		System.out.println("Total Salary Calculated: " + totalSalaryOfAllEmployees);
		
		JsonBuildVisitor jsonVisitor = new JsonBuildVisitor();
		JSONArray array = new JSONArray();
		for(int i = 0; i < employees.length; i++) {
			array.add(employees[i].accept(jsonVisitor));
		}
		System.out.println(array);
	}

}
