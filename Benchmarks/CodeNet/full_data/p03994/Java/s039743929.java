import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt();

		int count = 0;



		for (int i = 0; i < s.length ;i++) {
			//count =  ((s[i] - 'a') % 26 + 'a');
			count = 26 - (s[i] - 'a');

			if (count <= k) {
				s[i] = 'a';
				k = k - count;
			}

		//	System.out.println(count);
		}

		if (k > 0) {
			s[s.length -1] = (char) ((s[s.length -1] - 'a' + k) % 26 + 'a');
		}

		for (int i = 0; i < s.length ;i++) {
			System.out.print(s[i]);
		}



		System.out.println("");

		sc.close();
	}
}
