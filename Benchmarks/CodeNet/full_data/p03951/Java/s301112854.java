import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char s[] = sc.next().toCharArray();
		char t[] = sc.next().toCharArray();

		int MAX = N-1;

		int flag = 0;

		int ans = N * 2;

		for (int i = 0; i < N; i++) {
			if(s[i] == t[i]){

			}else{
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
				System.out.println(N);
			System.exit(0);
		}


		for (int i = 0; i < N ; i++) {
			if(s[MAX-i] == t[i]){
				ans = ans - 1;
			} else {
				break;
			}
		}

		System.out.println(ans);


		sc.close();
	}


}
