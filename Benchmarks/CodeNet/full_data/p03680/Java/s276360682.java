import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for (int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		boolean[] reachable = new boolean[n+1];
		int cur = 1;
		int hops = 0;
		while(!reachable[cur] && cur != 2) {
			reachable[cur] = true;
			cur = a[cur];
			hops++;
		}
		reachable[cur] = true;
		System.out.println(reachable[2] ? hops : -1);
		sc.close();
	}

}
