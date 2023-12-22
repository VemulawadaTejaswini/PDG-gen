import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
		    if (n % 2 == 0 ^ i % 2 == 0) {
		        deq.push(sc.nextInt());
		    } else {
		        deq.add(sc.nextInt());
		    }
		}
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		while (deq.size() > 0) {
		    if (flag) {
		        sb.append(" ");
		    }
		    flag = true;
		    sb.append(deq.pop());
		}
	    System.out.println(sb);
	}
}
