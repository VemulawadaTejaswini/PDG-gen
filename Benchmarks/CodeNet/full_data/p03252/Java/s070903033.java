import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		char s[] = sc.next().toCharArray();
		int ss[] = new int[s.length];
		int sa[] = new int[26];
		char t[] = sc.next().toCharArray();
		int tt[] = new int[t.length];
		int ta[] = new int[26];

		int si=1;
		int ti=1;
		for(int i=0; i<s.length; i++) {
			int j=0;
			int k=0;

			k=sa[s[i]-'a']++;
			if(k ==0) {
				j=si++;
			} else {
				j=k;
			}
			ss[i]=j;

			k=ta[t[i]-'a']++;
			if(k ==0) {
				j=ti++;
			}else {
				j=k;
			}
			tt[i]=j;
		}
		int j=0;
		for(; j<s.length; j++) {
			if(ss[j] != tt[j]) break;
		}
		if(j == s.length) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
