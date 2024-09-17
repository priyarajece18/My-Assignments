package week1.day1;

public class HelloTestLeaf {

	private int num() {
		
		return 456;
	}

	public static void main(String[] args) {
		
		int a =10;
		System.out.println("Welcome To TestLeaf"+a);
		
		HelloTestLeaf obj =new HelloTestLeaf();
		int card=obj.num();
	    System.out.println(obj.num());
		
		
		
		

	}

}
