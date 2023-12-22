import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		int[] s = new int[3];

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}

		int cnt = 0;

		for (int i = 0; i < s.length; i++) {
			if(s[i] == 1) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}

}
