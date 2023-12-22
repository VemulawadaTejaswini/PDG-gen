import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] p = new int[n];
		int[] ps = new int[n];

		int i;
		for(i = 0; i < n; i++) {
			p[i] = scan.nextInt();
			ps[i] = i + 1;
		}

		int cnt = 0;
		for(i = 0; i < n; i++) {
			if(p[i] != ps[i])
				cnt++;
		}

		if(cnt == 0 || cnt == 2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
