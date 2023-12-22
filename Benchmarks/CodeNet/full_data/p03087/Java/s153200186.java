
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		char[] list = sc.next().toCharArray();
		String ans = "";

		for(int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int count = 0;
			boolean flag = false;
			for(int j = l - 1; j < r; j++) {
				if(flag) {
					if(list[j] == 'C') {
						count++;
					}
					flag = false;
				} else {
					if(list[j] == 'A') {
						flag = true;
					}
				}
			}
			ans = ans + count + "\n";
		}
		System.out.print(ans);
	}

}
