import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		
		float[] map = new float[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextFloat();
			map[i] = T - map[i] * 0.006F;
		}
		
		int ans = -1;
		float min = Float.MAX_VALUE;
		for (int i = 0; i < map.length; i++) {
			if (min > Math.abs(map[i] - A)) {
				min = Math.abs(map[i] - A);
				ans = i;
			}
		}
		
		System.out.println(ans+1);
	}
}