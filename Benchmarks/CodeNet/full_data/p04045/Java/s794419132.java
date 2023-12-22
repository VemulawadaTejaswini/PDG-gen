import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[]D = new int[K];
		for(int i = 0; i < K; i++) {
			D[i] = sc.nextInt();
		}
		sc.close();
		int t = N;
		while(true) {
			String n = Integer.toString(t);
			boolean flag = true;
			loop: for(int i = 0; i < n.length(); i++) {
				for(int j = 0; j < K; j++) {
					if((int)n.charAt(i) - '0' == D[j]) {
						flag = false;
						break loop;
					}
				}
			}
			if(flag) {
				break;
			}
			t++;
		}
		System.out.println(t);
	}
}