import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long k = scan.nextLong();
		
		//n-kiが最小になればいい
		
		long x = n%k;
		if(Math.abs(x-k) < x) {
			System.out.println(Math.abs(x-k));
		}else {
			System.out.println(x);
		}
		
	}	
}