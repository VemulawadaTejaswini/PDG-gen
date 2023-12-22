import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		String[] answer = new String[n];
		try {
		for(int i = 0;i < m;i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			answer[s[i]-1] = String.valueOf(c[i]);
		}

		for(int i = 0;i < m;i++) {
			if(answer[i] == null) {
				answer[i] = "0";
			}
		}
		if(answer[0].equals("0")) {
			System.out.println(-1);
		}else {
			System.out.println(String.join("", answer));
		}
		}catch(Exception e) {
			System.out.println(-1);
		}

	}

}