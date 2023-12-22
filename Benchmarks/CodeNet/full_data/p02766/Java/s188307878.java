import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc165_b();
	}
  
  	public static void solve_abc165_b(){
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		int K = sc.nextInt();
		
		String N2 = Long.toString(N,K);
		
		//System.out.println(N2);
		System.out.println(N2.length());
	}
}