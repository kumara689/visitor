package org.test.java.sal.visitor;

public interface SalaryVisitable {

	double accept(SalaryVisitor visitor);
	
}
