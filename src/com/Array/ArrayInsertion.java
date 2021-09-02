package com.Array;
import java.util.Scanner;
public class ArrayInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, i, p, v;
	    n=sc.nextInt();
	    int ele[]=new int[n+1];
	    for(i=0;i<n;i++)
	    {
	    	ele[i]=sc.nextInt();
	    }
	    p=sc.nextInt();
	    v=sc.nextInt();
	    for(i=(n-1);i>=(p-1);i--)
	    {
	        ele[i+1]=ele[i];
	    }
	    ele[p-1]=v;
	    for(i=0;i<=n;i++)
	    {
	    	System.out.println(ele[i]);
	    }

	}

}
