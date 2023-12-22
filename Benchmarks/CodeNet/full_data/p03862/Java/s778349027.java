import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] a = new int[n];
		
		int c = 0;
		int k;
		
		a[0] = sc.nextInt();
		for(int i=1; i<n; i++){
			a[i] = sc.nextInt();
			k = a[i] + a[i-1];
			if(k > x){
				 a[i] -= k - x;
				 c += k - x;
			}
		}
		
		System.out.println(c);
		
		sc.close();
	}
}