package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
	public static void main(String args[]) {
		ArrayList<Employee> list1=new ArrayList<Employee>();
		list1.add(new Employee(104,"Priya",Employee.Status.CONFIRMED));
		list1.add(new Employee(103,"Gayathri",Employee.Status.FAILED));
		list1.add(new Employee(102,"Ram",Employee.Status.PENDING));
		list1.add(new Employee(101,"Anu",Employee.Status.CONFIRMED));

		System.out.println("Sorting by Name");
		
		Collections.sort(list1,new NameComparator());
		Collections.sort(list1, new IdComparator());
		for(Employee e:list1)
		{
			System.out.println("Employee Id: "+e.id+" "+"Employee Name: "+e.name+" "+"Status: "+e.status);
		}
	}	
}

class Employee
{
	enum Status
	{
		CONFIRMED,PENDING,FAILED
	}
	int id;
	String name;
	Status status;
	public Employee(int id, String name,Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status=status;
	}	
}
