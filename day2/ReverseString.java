package week1.day2;

public class ReverseString {
	
	public static String reverseString(String str) {
		 String revstn="";
	     
	      for(int i=str.length()-1;i>=0;i--){
	        revstn=revstn+str.charAt(i);
	      }
	      System.out.println(revstn);
		
		return str;
		
	}
	

	public static void main(String[] args) {
		ReverseString.reverseString("testleaf");
	   
	   
	    

	}

}
