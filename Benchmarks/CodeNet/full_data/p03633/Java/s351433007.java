import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Main{
	
	// a < b
	public static long gcd(long a, long b){
		if(b % a == 0){
			return a;
		}
		long mod = b % a;
		
		return gcd(mod, a);
	}
	
	public static long lcm(long a, long b){
		long lower = 0;
		long higher = 0;
		if(a < b){
			lower = a;
			higher = b;
		} else {
			lower = b;
			higher = a;
		}
		
		return lower / gcd(lower, higher) * higher;
	}
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Long> times = new LinkedList<>();
		
		// input
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			times.push(scan.nextLong());
		}
		
		// check
		Collections.sort(times);
		while(times.size() > 1){
			times.push(lcm(times.pop(), times.pop()));
		}
		
		// answer
		System.out.println(times.pop());
		
	}
		
}