package org.test.java.sal.visitor;

import org.test.java.domain.CommissionBasedEmployee;
import org.test.java.domain.FixedSalaryEmployee;
import org.test.java.domain.MixedSalaryEmployee;

public class SalaryCalcVisitor implements SalaryVisitor {

	@Override
	public double visit(FixedSalaryEmployee fixedSalary) {
		return fixedSalary.getSalary();
	}

	@Override
	public double visit(CommissionBasedEmployee commission) {
		return commission.getSalesVolume() * commission.getCommission();
	}

	@Override
	public double visit(MixedSalaryEmployee mixedSalary) {
		return (mixedSalary.getSalesVolume() * mixedSalary.getCommission()) +
				mixedSalary.getSalary();
	}


}
