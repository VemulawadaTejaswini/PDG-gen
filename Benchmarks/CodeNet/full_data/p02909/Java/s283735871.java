import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();

	switch (s) {
	    case "Sunny":
	        System.out.println("Rainy");
	        break;
	    case "Rainy":
	        System.out.println("Cloudy");
	        break;
	    case "Cloudy":
	        System.out.println("Sunny");
	        break;
	}
  }
}