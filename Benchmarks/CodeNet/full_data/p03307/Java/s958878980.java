import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner();
        int n = Integer.parseInt(sc.next());
        System.out.println(n % 2 != 0 ? n * 2 : n);
    }
}