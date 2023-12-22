import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//入力
		int n = sc.nextInt();
		String s = sc.next();

		int p = 0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i) == '#') {
				p = i;
				break;
			}
		}

		int c = 0;
		for(char x : s.toCharArray()) {
			if(x == '#') {
				c++;
			}
		}

		System.out.println(n-p-c);

		sc.close();
	}
}