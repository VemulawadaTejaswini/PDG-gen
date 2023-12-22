import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int lo = Integer.MAX_VALUE;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (x<=lo) {
				cnt++;
				lo=x;
			}
		}
		System.out.println(cnt);
	}
}