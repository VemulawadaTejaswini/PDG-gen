import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int max = 0, mn = 1;
		int prev = sc.nextInt();
		for(int i = 1; i < N; i++) {
			int a = sc.nextInt();
			if(a > prev) {
				if(max == a - prev)
					mn++;
				else if(max < a - prev) {
					max = a - prev;
					mn = 1;
				}
			}
			else
				prev = a;
		}
		System.out.println(mn);
	}

}