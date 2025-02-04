import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] l = new int[N];
		for(int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		int sum = 0;
		for(int i = 0; i < K; i++) {
			sum += l[N - 1 - i];
		}
		System.out.println(sum);
	}
}