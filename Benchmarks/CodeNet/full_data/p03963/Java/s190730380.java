import java.io.*;
import java.math.*;
import java.util.*;
public class Main{ 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long K = input.nextLong();
		long ans = K;
		K--;
		N--;
		for (long ball = 1; ball <= N; ball++) {
			ans*=K;
		} 
		System.out.println(ans);
	}
}