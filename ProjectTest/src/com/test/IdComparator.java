package com.test;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee E1=(Employee) o1;
		Employee E2=(Employee) o2;
		if(E1.id==E2.id)
		{
			return 0;
		}
		else if(E1.id>E2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
		
	

