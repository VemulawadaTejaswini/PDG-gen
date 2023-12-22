import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char s[] = sc.next().toCharArray();
		char t[] = sc.next().toCharArray();

		int ans = N * 2;
		int start = -1;
		int count = 0;


		for (int i = 0; i < N; i++) {
//			System.out.print(s[N-1] + ",");
//			System.out.println(t[i]);
			if (s[N-1] == t[i]) {
				start = i;
				break;
			}
		}

		if (start == -1) {
			System.out.println(ans);
			System.exit(0);
		}

		if (start == 0){
			ans = ans - 1;
			System.out.println(ans);
			System.exit(0);
		}

		int a = 1;
		for (int k = start -1; k >=0 ; k--) {
			a = a+1;
//			System.out.print(s[N-a] + ",");
//			System.out.println(t[k]);

			if (s[N-a] == t[k]) {

				count = count + 1;
			} else{
				break;
			}
		}

		System.out.println(ans - count -1);


		sc.close();
	}


}
