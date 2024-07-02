package com.kodnest.project1;

import java.util.Scanner;

public class ArrayInt {
	public static void main(String[] args)
	{
		System.out.println("user! please enter the size of an Array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("User!! plese enter "+size+"elemets");
		for(int i=0; i<=size-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("The elements are:");
		for(int i=0;i<=size-1;i++)
		{
			System.out.println(a[i]);
				
			}
		}
	}

