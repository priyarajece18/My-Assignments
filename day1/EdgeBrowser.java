package week1.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser obj=new Browser();
		String browser=obj.launchBrowser("Edge");
		System.out.println("The browser is "+browser);
		obj.loadUrl();

	}

}
