//write a java program to read and display 5 employee objects.

package com.kodnest.project1;
import java.util.Scanner;

public class PracticeArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Employee a[]=new Employee[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Employee();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the employee-"+i+ "name");
			a[i].name=scan.nextLine();
		}
		System.out.println("The elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].name);
		}
	}
	
	}
	class Employee{
		String name;
	}

