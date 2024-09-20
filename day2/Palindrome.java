package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int a=121;
		int b=a;
		int quot=0;
		int rem;
		System.out.print("The reversed number is :");
		for(int i=0;i<3;i++) {
			rem=a%10;
			quot=quot*10+rem;
			a=a/10;
			
		}
		System.out.println(b);
		
		if(quot==b) {
			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not a Palindrome");
		}
		
		

	}

}
