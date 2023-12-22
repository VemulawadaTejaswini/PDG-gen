import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(d);
		int l = d[N/2 - 1];
		int r = d[N/2];
		System.out.println(r - l);
	}
}
