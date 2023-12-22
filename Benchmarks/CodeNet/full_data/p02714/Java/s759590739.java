import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		long R = 0;
		long G = 0;
		long B = 0;
		for(int i = 0; i < N; i++) {
			char ch = S.charAt(i);
			if(ch == 'R')R++;
			else if(ch == 'G')G++;
			else B++;
		}
		long count = 0;
		for(int i = 1; i <= (N - 1) / 2; i++) {
			for(int j = 0; j < N-(i * 2); j++) {
				char ch1 = S.charAt(j);
				char ch2 = S.charAt(j+i);
				char ch3 = S.charAt(j+(i*2));
				if(ch1 != ch2 && ch2 != ch3 && ch1 != ch3)count++;
			}
		}
		System.out.println(R*G*B-count);
	}
}