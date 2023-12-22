import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();
		char[] cc = new char[n];

		int max = 0;
		for(int i = 0;i < c.length; i++) {
			int itr = 0;
			int count = 0;
			for(int j = itr; j < c.length; j++) {
				if(c[i] == c[j]) {
					count++;
				}
			}
			if(max < count) {
				max = count;
			}
		}
		System.out.println(n - max);
	}
}