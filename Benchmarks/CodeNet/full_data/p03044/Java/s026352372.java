
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] re = new int[n+1];
		Arrays.fill(re, 5);
//		 BigDecimal aa = new BigDecimal(n);
		
		for(int i=0; i<n-1; i++) {
			int v = scan.nextInt();
			int u = scan.nextInt();
			int w = scan.nextInt();
			if(w%2==0) {
				if(re[v] == 5 || re[u] == 5) {
					re[v] = 0;
					re[u] = 0;
				}else {
				re[u] = re[v];
				}
			}else {
				if(re[v] == 5 || re[u] == 5) {
					re[v] = 0;
					re[u] = 1;
				}else if(re[v] == 0){
					re[u] = 1;
				}else {
					re[u] = 0;
				}
			}
		}
		for(int i=1; i<n+1; i++) {
			System.out.println(re[i]);
		}
 
	}
}