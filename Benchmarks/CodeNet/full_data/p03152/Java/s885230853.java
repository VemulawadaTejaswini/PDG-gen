
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		int[] x = new int[n*m+1];
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
			if(set.contains(a[i])){
				x[i] = 0;
			}else{
				x[i] = -a[i];
				set.add(a[i]);
			}
		}

		for(int j = 0; j < m ; j++){
			b[j] = sc.nextInt();
			if(set.contains(b[j])){
				x[n+j] = 0;
			}else{
				x[n+j] = -b[j];
				set.add(b[j]);
			}
		}
		x[n+m] = 0;

		Arrays.sort(x);
		
		if(x[0] != -n*m){
			System.out.println(0);
			return;
		}

		int col = 0;
		int row = 0;
		
		int ans = 1;
		
		for(int k = 0; x[k] != 0; k++){
			
			int from = -x[k+1];
			int to = -x[k];
			
//			System.out.println(from +" - "+to);
			int filled = n*m - to;
			
			int c1 = 0;
			int r1 = 0;
			int c2 = 0;
			int r2 = 0;
			for(int i=0; i < n;i++){
				if(a[i] == to) {
					col++;
					c1++;
				}
				if(a[i] > to){
					c2++;
				}
			}
			
			for(int j = 0 ; j < m;j++){
				if(b[j] == to) {
					row++;
					r1++;
				}
				if(b[j] > to){
					r2++;
				}
			}
			
			if(c1 >= 2 || r1 >= 2){
				System.out.println(0);
				return;
			}
			
//			System.out.println("(col,row) :"+col+" "+row);
			
			int rem = col*row - filled -1;
			int toFill = (to - from) - 1;
					
			int pat = nPr(rem ,toFill);
			if(!(c1 == 1 && r1 == 1)){
				if(c1 == 1){
					ans = prod(ans, Math.max(r2,1));					
				}
				if(r1 == 1){
					ans = prod(ans, Math.max(c2,1));										
				}
			}
			ans = prod(ans,pat);			
		}
		System.out.println(ans);
	}
	

	int nPr(int n, int r){
		if(n < r){
			return 0;
		}
		int ans = 1;
		for(int i = n-r+1; i <= n; i++){
			ans = prod(ans,i);
		}
//		System.out.println(n+"P"+r+ " = " + ans);
		return ans;
	}
	
	int mod = 1_000_000_000 + 7;
	int prod(int a,int b){
		return (int)(((long)(a)*(b))%mod);
	}
}
