
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		String sline = sc.next();
		sc.close();
		String[] s = new String[n];
		for (int i=0; i<n; i++){
			s[i] = String.valueOf(sline.charAt(i));
		}
		int ans = 0;
		for(int i=0; i<n-1; i++) {
			if (s[i].equals("#")&&s[i+1].equals(".")) {
				s[i+1] = "#"; 
				ans++;
			}
		}
		System.out.println(ans);
	}

}
