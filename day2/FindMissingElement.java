package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int array1[]={1,4,3,2,8,6,7};
		//sorting
		Arrays.sort(array1);
		System.out.print("The sorted Array :");
		for(int k=0;k<=array1.length-1;k++) 
		System.out.print(array1[k]);
		System.out.println();
		//sum of array
		int sum=0;
		for(int i=0;i<=array1.length-1;i++) {
			sum=sum+array1[i];
		}
		System.out.println("Sum of array :"+sum);
		//sum of the ranges of array
		int sumrange=0;
		for(int j=1;j<=8;j++) {
			sumrange=sumrange+j;
		}
		System.out.println("Sum of the range of array :"+sumrange);
		//subracting sum-sumrange
		int missingElemt=sumrange-sum;
		System.out.println("Missing element is :"+missingElemt);
		
	}
	
	}
	