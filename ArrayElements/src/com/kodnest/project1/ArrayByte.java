package com.kodnest.project1;

import java.util.Scanner;

public class ArrayByte {
	public static void main(String[] args) {
	System.out.println("user! please enter the size of an Array");
	Scanner scan=new Scanner(System.in);
	byte size=scan.nextByte();
	byte[] a=new byte[size];
	System.out.println("User!! plese enter "+size+"elemets");
	for(int i=0; i<=size-1;i++)
	{
		a[i]=scan.nextByte();
	}
	System.out.println("The elements are:");
	for(int i=0;i<=size-1;i++)
	{
		System.out.println(a[i]);
			
		}
	}
}


