import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int A[] = new int[26];
		for (int i=0;i<s.length();i++) {
			A[s.charAt(i)-'a']++;
		}
		for (int i=0;i<A.length;i++) {
			if (A[i]==0) {
				System.out.print(s);
				System.out.print((char)(i+'a'));
				return;
			}
		}
		for (int i=A.length-1;i>=0;i--) {
			A[s.charAt(i)-'a']--;
			for (char c=(char) (s.charAt(i)+1);c<='z';c++) {
				if (A[c-'a']==0) {
					System.out.print(s.substring(0,i));
					System.out.print(c);
					return;
				}
			}
		}
		System.out.println(-1);
	}
}