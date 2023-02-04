package com.collectionproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee ("john",2.5);
		Employee e2 = new Employee ("King",3.5);
		Employee e3 = new Employee ("James",4.5);

		Map<String,Employee> map = new LinkedHashMap <String,Employee>();
		//Adding 3 Entries // map.put(k,v);
		map.put(e1.getName(),e1);
		map.put(e2.getName(),e2);
		map.put(e3.getName(),e3);
		// Converting map in to Set of key
		Set<String> keys = map.keySet();// "john","King","james"
		// Created an instance of ArrayList()
		List <Employee> list = new ArrayList<>();
		//Adding values (employee objects) from map in to arraylist
		for(String key:keys)
		{
			list.add(map.get(key));// Employee obj = map.get(key); // list.add(obj);
		}
		
		// Traversing Employee object from Arraylist
		for(Employee emp : list)
		{
			System.out.println(emp);
		}
		//list.add(map.get("john"));
		//list.add(map.get("king"));
		//list.add(map.get("james"));
		
		System.out.println("-----------");
		
		
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("1:Sorting by name\n2:Sorting by salary\n3:Exit");
		System.out.println("Enter your choice");
		
		switch(sc.nextInt())
		{
		case 1:
		
			Collections.sort(list,new SortEmployeeByName());
			for(Employee emp : list)
			{
				System.out.println(emp);
			}
		break;
		
		case 2:
			
			Collections.sort(list ,new SortEmployeeBySalary());
			for(Employee emp : list)
			{
				System.out.println(emp);
			}
		break;
		
		case 3:
		{
			System.out.println("Thk u");
			System.exit(0);
		}
		default :
		{
			try
			{
				throw new InvalidChoiceException("Invalid choice, Please Enter valid Choice");
			}
			catch(InvalidChoiceException e)
			{
				System.out.println(e.getMessage());
			}
		}
		}
		
		}
		
		
		
		
		
		
		
		






	}

}
