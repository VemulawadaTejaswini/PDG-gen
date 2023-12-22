import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int K = input.nextInt();
		if (B-A>=2*K) {
			for (int cur = A; cur < A+K; cur++) {
				System.out.println(cur);
			}
			int START = B-K+1;
			for (int cur = START; cur <= B; cur++) {
				System.out.println(cur);
			}
		}else {
			for (int cur = A; cur <= B; cur++) {
				System.out.println(cur);
			}
		}
	}	
}