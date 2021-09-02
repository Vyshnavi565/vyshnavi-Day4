package com.Array;
import java.util.Scanner;
public class ArrayRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, i, j, range;
	       n=sc.nextInt();
	       int arr[] = new int [n];
	       for(i=0;i<n;i++)
	       {
	    	   arr[i]=sc.nextInt();
	       }
	       int min=arr[0];
	       int max=arr[0];
	       for(i=0;i<n;i++)
	       {
	    	   if(max<arr[i])
	    	   {
	    		   max=arr[i];
	    	   }
	       }
	       for(i=0;i<n;i++)
	       {
	    	   if(min>arr[i])
	    	   {
	    		   min=arr[i];
	    	   }
	       }
	       range=max-min;
	       System.out.println("The range of array is " +range);

	}

}
