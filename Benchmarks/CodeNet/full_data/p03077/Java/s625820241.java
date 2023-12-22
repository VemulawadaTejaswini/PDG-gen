import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong(), A = sc.nextLong(), 
	        B = sc.nextLong(), C = sc.nextLong(), 
	        D = sc.nextLong(), E = sc.nextLong();
	    long ans = (long)(Math.ceil((double)N/A) + Math.ceil((double)A/B) + Math.ceil((double)B/C) + Math.ceil((double)C/D) + Math.ceil((double)D/E));
	    System.out.println(ans);
	}
}
