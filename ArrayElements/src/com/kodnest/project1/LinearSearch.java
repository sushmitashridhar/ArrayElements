package com.kodnest.project1;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("user! please enter the size of an Array");
		int size=scan.nextInt();
		int a[] = new int[size];
		System.out.println("user! please enter the elements of an Array");
		for(int i=0; i<=a.length-1;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("user! please enter the elements to be searched");
		int ele=scan.nextInt();
		
		boolean flag=false;
		for(int i=0; i<=a.length-1;i++)
		{
			if(ele ==a[i]) {
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("elements present");
		}
		else
		{
			System.out.println("Not present");
			
		}
	}
}
	
