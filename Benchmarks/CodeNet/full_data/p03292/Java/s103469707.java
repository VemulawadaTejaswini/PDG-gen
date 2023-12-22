import java.util.*;

public class Main {
  	static Scanner scanner = new Scanner(System.in);
  
	public static void main(String[]$) {
      	int a1 = scanner.nextInt(), a2 = scanner.nextInt(), a3 = scanner.nextInt();
    	System.out.println(Math.max(Math.max(a1, a2), a3) - Math.min(Math.min(a1, a2), a3));
    }
}