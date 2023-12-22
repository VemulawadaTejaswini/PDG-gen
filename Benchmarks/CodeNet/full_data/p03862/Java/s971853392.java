import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] A = new int[n];
		int[] a = new int[n];
		
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			a[i] = A[i];
		}
		
		int c1 = 0;
		int c2 = 0;
		int c;
		int k;
		
		
		for(int i=1; i<n; i++){
			k = a[i] + a[i-1];
			if(k > x){
				 a[i] -= k - x;
				 c1 += k - x;
				 
				 
			}
		}
		
		for(int i=0; i<n; i++){
			a[i] = A[i];
		}
		for(int i=0; i<n-1; i++){
			k = a[i] + a[i+1];
			if(k > x){
				 a[i] -= k - x;
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