import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		String[] s = new String[n];
		for(int i =0;i<n;i++) {
			s[i]=scan.next();
		}

		Arrays.sort(s);
		for(int i =0;i<n;i++) {
			System.out.print(s[i]);
		}
		}
	}


