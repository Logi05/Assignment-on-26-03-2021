package com.test;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
public int compare(Employee o1,Employee o2)
{
	Employee E1=(Employee) o1;
	Employee E2=(Employee) o2;
	
	return E1.name.compareTo(E2.name);
}
}
