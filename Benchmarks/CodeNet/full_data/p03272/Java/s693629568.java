import java.util.*;

public class Main() { 
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if(1 > n || n > 100) {
        	n = sc.nextInt();
        }
        
        if(1 > i || i > n) {
        	i = sc.nextInt();
        }
        
        System.out.println(n + 1 - i);
    }
}
