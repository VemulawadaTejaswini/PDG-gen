import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int s = sc.next();

    if (s.equals("Sunny")) {
	  System.out.println("Cloudy");
    } else if (s.equals("Cloudy")) {
      System.out.println("Rainy");
    } else {
      System.out.println("Sunny");
    }
    
  }
}
