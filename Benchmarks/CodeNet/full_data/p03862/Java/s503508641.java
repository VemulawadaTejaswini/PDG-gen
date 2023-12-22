import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] A = new int[n];
		
		
		int[] a = new int[n];
		boolean[] b = new boolean[n-1];
		int cnt = 0;
		
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++){
			a[i] = A[i];
		}
		
		for(int i=1; i<n; i++){
			if(A[i-1] + A[i] > x) b[cnt] = true;
			cnt++;
		}
		
		
		
		long c1 = 0;
		long c2 = 0;
		long c;
		long k;
		
		
		for(int i=1; i<n; i++){
			k = a[i] + a[i-1];
			if(k > x){
				if(a[i] >= k){
					a[i] -= k - x;
				}else{
					a[i] = 0;
					a[i-1] -= k - x - a[i];
				}
				c1 += k - x;
			}
		}
		
		for(int i=0; i<n; i++){
			a[i] = A[i];
		}
		for(int i=0; i<n-1; i++){
			k = a[i] + a[i+1];
			if(k > x){
				if(a[i] >= k){
					a[i] -= k - x;
				}else{
					a[i] = 0;
					a[i+1] -= k - x - a[i];
				}
				c2 += k - x;
			}
		}
		
		if(c1 > c2){
			c = c2;
		} else {
			c = c1;
		}
		
		
		System.out.println(c);
		
		sc.close();
	}
}