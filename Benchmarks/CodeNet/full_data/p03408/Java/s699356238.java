import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s[] = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		int m = sc.nextInt();
		String t[] = new String[m];
		for(int i = 0;i < m; i++) {
			t[i] = sc.next();
		}




		for(int i = 0; i < n; i ++){
			int ans = 0; //大きい数字に更新
			int count = 0; //計算結果


			for(int j = 0; j < n; j++) {
				if(s[i] == s[j]) {
					count ++;
				}
			}
			for(int k = 0; k < m; k++) {
				if(s[i] == t[k]) {
					count --;
				}
			}

			if(count > ans) {
				ans = count;
			}

			if(i + 1 == n) {
				System.out.println(ans + 1);
			}

		}




	}


}