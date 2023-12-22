import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		int sr = scanner.nextInt()-1;
		int sc = scanner.nextInt()-1;
		char[] S = scanner.next().toCharArray();
		char[] T = scanner.next().toCharArray();

		int r = 0;
		int l = 0;
		int u = 0;
		int d = 0;
		for (int i=0; i<n; i++){
			switch (S[i]){
				case 'R':
					r++;
					if (r>(w-1)-sc) no();
					break;
				case 'L':
					l++;
					if (l>sc) no();
					break;
				case 'U':
					u++;
					if (u>sr) no();
					break;
				case 'D':
					d++;
					if (d>(h-1)-sr) no();
					break;
			}
			switch (T[i]){
				case 'L':
					if (r>-sc)r--;
					break;
				case 'R':
					if (l>sc-(w-1)) l--;
					break;
				case 'D':
					if (u>sr-(h-1)) u--;
					break;
				case 'U':
					if (d>-sr) d--;
					break;
			}
		}
		System.out.println("YES");
	}

	static void no() {
		System.out.println("NO");
		System.exit(0);
	}
}