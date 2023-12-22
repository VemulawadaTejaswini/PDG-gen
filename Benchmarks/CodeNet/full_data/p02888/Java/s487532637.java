import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] len = new int[N];
		long cnt = 0;
		for (int i = 0; i < N; i++) {
			len[i] = input.nextInt();
		} 
		Arrays.sort(len);
		for (int S = 0; S < N; S++) {
			for (int M = S+1; M < N; M++) {
				for (int L = M+1; L < N; L++) {
					if (len[L]<len[M]+len[S]) cnt++;
					else break;
				}
			}
		}
		System.out.println(cnt);
	}
}