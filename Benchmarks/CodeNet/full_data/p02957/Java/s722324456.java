import java.util.*;
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");
    int a = Integer.parseInt(line[0]);
    int b = Integer.parseInt(line[1]);
    if ((a + b) % 2 == 0) {
    	System.out.println((a + b) / 2);
    } else {
    	System.out.println("IMPOSSIBLE");
    }
    
    }
}