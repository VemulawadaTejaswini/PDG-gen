import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt(), M = sc.nextInt();
	    int min = 0, max = 100000;
	    for (int i=0; i<M; i++) {
	        int l = sc.nextInt(), r = sc.nextInt();
	        min = Math.max(min,l);
	        max = Math.min(max,r);
	    }
	    int ans = Math.max(max - min + 1,0);
		System.out.println(ans);
	}
}