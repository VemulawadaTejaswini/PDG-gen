import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s[] = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.nextLine();
		}
		sc.close();

		//処理
		int counter[][] = new int[n][26];
		int m = 10;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 26; j++){
				counter[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				counter[i][s[i].charAt(j) - 'a']++;
			}
		}

		long ans = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				boolean f = true;
				for(int k = 0; k < 26; k++){
					if(counter[i][k] != counter[j][k]) f = false;
				}
				if(f) ans++;
			}
		}
		
		//出力
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}
}