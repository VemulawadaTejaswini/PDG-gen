import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int cnt = 0;
		for(int j = 0; j < s.length(); j++) {
			if(s.charAt(j) == '2') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}