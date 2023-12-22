import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] T = new int[N+1];
    	for (int i = 1; i <= N; i++) {
    		T[i] = sc.nextInt();
    	}
    	int M = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 1; i <= M; i++) {
    		int count = 0;
    		int Dnum = sc.nextInt();
    		int Dshort = sc.nextInt();
    		for (int j = 1; j <= N; j++) {		
    			if (j == Dnum) {
    				int time = Math.max(T[j] - Dshort, 0);
    				count += time;
    			} else {
    				count += T[j];
    			}
    		}
    		sb.append(count + "\n");
    	}
    	System.out.println(sb);
    }
}