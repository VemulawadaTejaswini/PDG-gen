import java.util.*;
 
public class Main {
  	static Scanner scanner = new Scanner(System.in);
  
	public static void main(String[]$) {
    	System.out.println(String.format("Christmas%0" + (26 - scanner.nextInt()) + "d", 1).replaceAll("01?", " Eve"));
    }
}