import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float v[] = new float[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		
		float ans = v[0];

		for(int i = 0; i < n; i++) {
			ans = (ans + v[i]) / 2;
//			System.out.println(ans);
		}
		
		System.out.println(ans);
	}
}