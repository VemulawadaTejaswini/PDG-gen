import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long a[] = new long[num];
		long b[] = new long[num];
		for(int i = 0; i < num; i ++) {
			a[i] = sc.nextLong();
			b[i] = a[i];
		}
		Arrays.sort(a);
		int count = 0;
		for(int i = 0; i < num; i ++) {
			if(a[i] != b[i]) { count ++; }
		}

		System.out.println(count <= 2 ? "YES" : "NO");
	}
}