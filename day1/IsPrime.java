package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		//using array
		int[] n= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<=n.length-1;i++) {
			if(n[0]%2!=1) {
				System.out.println("Prime number is :"+n[i]);
			}
			else {
				System.out.println("Not a prime number is :"+n[i]);
			}
			n[0]++;
		}
		//normal 
		int n1=11;
		if(n1%2==0) {
			System.out.println(n1+" is Prime number");
		}
		else {
			System.out.println(n1+" is not a Prime number");
		}
		//using scanner class
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n2=sc.nextInt();
		if(n2%2==0) {
			System.out.println(n2+" is Prime number");
		}
		else {
			System.out.println(n2+" is not a Prime number");
		}

	}

}
