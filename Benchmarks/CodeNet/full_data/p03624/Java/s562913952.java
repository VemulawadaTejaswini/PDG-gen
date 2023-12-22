import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count[] = new int[26];
		
		s = sc.next();
		
		sc.close();
		
		int n = s.length();
		String ans = "None";
		
		for(int i = 0; i < n; ++i) {
			int tmp = (int)(s.charAt(i) - 'a');
			count[tmp]++;
		}
		for(int i = 0; i < 26; ++i) {
			if(count[i] <= 0) {
				char tmp = (char)(i + 'a');
				ans = String.valueOf(tmp);
				break;
			}
		}
		System.out.println(ans);
	}

}
