import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] f = new int[26];
		for(int i = 0; i < 26; i++) {
			f[i] = 0;
		}
		
		for(int i = 0; i < s.length(); i++) {
			f[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(f[i] != 0 && f[i] !=1) {
				System.out.println("no");
				System.exit(0);
			}
		}
		System.out.println("yes");
	}

}
