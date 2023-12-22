import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int min = 1;
		for(int i = 0;i < N;i ++) {
			min = min * 2;
		}
		for(int i = N - 1;i >= 0;i --) {
			int x = 1;
			for(int k = 0;k < i;k ++) {
				x = x * 2; 
			}
			for(int k = 0;k < N - i;k ++) {
				x += K;
			}
			if(x < min) min = x;
		}
		System.out.println(min);
	}
}