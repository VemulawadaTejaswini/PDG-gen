import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] A = new int[n];
		
		int c=0;
		int t, d;
		
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}
		
		if(A[0] > x){
			c += A[0] - x;
			A[0] = x;
		}
		
		for(int i=1; i<n; i+=2){
			t = A[i-1] + A[i];
			if(t > x){
				d = t - x;
				System.out.println(d);
				c += d;
				A[i] = d;
			}
		}
		
		
		System.out.println(c);
		
		sc.close();
	}
}