import java.util.*;

public class Main {
  	static Scanner scanner = new Scanner(System.in);
  
	public static void main(String[]$) {
    	System.out.println("Christmas" + String.format("%0" + (25 - scanner.nextInt()) + "d", 0).replace("0", " Eve"));
    }
}