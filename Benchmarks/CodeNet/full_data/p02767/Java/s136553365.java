import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc165_c();
	}
  
  	public static void solve_abc165_c(){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int sum = 0;
		
		for(int i=0;i<N;i++){
			x[i] = sc.nextInt();
			sum += x[i];
		}
		
		int p = (int)Math.round((double)sum / (double)N);
		int ans = 0;
		
		for(int xi: x){
			ans += Math.pow(p - xi, 2);
		}
				
		System.out.println(ans);
		
		sc.close();
	}
}