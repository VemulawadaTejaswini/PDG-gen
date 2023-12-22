import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt[][]= new int[n][26];
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				cnt[i][s.charAt(j)-'a']++;
			}
		}
		StringBuilder ans = new StringBuilder();
		for(int j=0; j<26; j++) {
			int min=50;
			for(int i=0; i<n; i++) {
				min = Math.min(min, cnt[i][j]);
			}
			ans.append(String.join("", Collections.nCopies(min, alphabet.substring(j, j+1))));
		}
		System.out.println(ans);
		sc.close();
	}

}