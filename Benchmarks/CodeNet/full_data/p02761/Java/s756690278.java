import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int dn[] = new int[n];
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			dn[i] = -1;
		}
		for(int i=0;i<m;i++) {
			int s = scan.nextInt();
			int c = scan.nextInt();
			if((dn[s-1] != -1 && dn[s-1] != c) || (s==1 && n!=1 && c==0)) {
				System.out.println(-1);
				System.exit(0);
			}else {
				dn[s-1] = c;				
			}
		}
		
		for(int i=0;i<n;i++) {
			if(dn[i] == -1 && (i==0 && n!=1)) {
				dn[i] = 1;
			}else if(dn[i] == -1) {
				dn[i] = 0;
			}
			
			ans += dn[i] * Math.pow(10,n-1-i);
		} 
		
		System.out.println(ans);
		
	}
	
}


