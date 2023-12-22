import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		if (k == 0) {
		    System.out.println(2);
		    System.out.println("1 1");
		    return;
		} else if (k == 1) {
		    System.out.println(2);
		    System.out.println("2 0");
		    return;
		} else if (k <= 50) {
		    StringBuilder sb = new StringBuilder();
		    sb.append(k).append("\n");
		    for (int i = 1; i <= k; i++) {
		        if (i != 1) {
		            sb.append(" ");
		        }
		        sb.append(i);
		    }
		    System.out.println(sb);
		    return;
		}
		long base = k / 50;
		long mod = k % 50;
	    StringBuilder sb = new StringBuilder();
	    sb.append(50).append("\n");
	    for (int i = 0; i < 50; i++) {
	        if (i != 0) {
	            sb.append(" ");
	        }
	        long next = base + i;
	        if (i < mod) {
	            next++;
	        }
	        sb.append(next);
	    }
	    System.out.println(sb);
   }
}

