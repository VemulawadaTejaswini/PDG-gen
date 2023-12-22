import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		int sum = 0;
		for(int r = 0; r <= 3000; r++) {
			sum = r * R;
			if(sum > N) break;
			for(int g = 0; g <= 3000; g++) {
				sum = r * R + g * G;
				if(sum > N) break;
				for(int b = 0; b <= 3000; b++) {
					sum = r * R + g * G + b * B;
					if(sum > N) break;
					if(sum == N) ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
