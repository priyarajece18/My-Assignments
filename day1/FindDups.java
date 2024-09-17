package week1.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindDups {

	public static void main(String[] args) {
		//using outer for loop and inner for loop
		int[] num= {2,5,7,7,5,9,2,3};
	    for (int i = 0; i < num.length; i++) {
	    	 
	    	for (int j =i+1 ; j < num.length; j++) {
				if(num[i]==num[j]) {
				  System.out.println(num[j]);
				}
			}
		}
	    System.out.println("************");
		//using array sort
	    Arrays.sort(num);
	    //2,2,3,5,5,7,7,9
	    for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1]) {
				 System.out.println(num[i]);
			}
		}
	   
	}

}
