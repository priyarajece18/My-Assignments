package week1.day1;

public class Fibonnaci {
	public static void main(String[] args) {
		int a = 0,b=1;
		System.out.println(a);
	    System.out.println(b);
		for(int i=0;i<=10;i++) {
			 int c=a+b;
			System.out.println(c);//1,
			a=b;
			b=c;
		}
		 

	}

}
