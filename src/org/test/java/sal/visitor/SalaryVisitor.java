package org.test.java.sal.visitor;

import org.test.java.domain.CommissionBasedEmployee;
import org.test.java.domain.FixedSalaryEmployee;
import org.test.java.domain.MixedSalaryEmployee;

public interface SalaryVisitor {

	double visit(FixedSalaryEmployee fixedSalary);
	double visit(CommissionBasedEmployee commisionBasedSalary);
	double visit(MixedSalaryEmployee mixedSalary);
	
}
