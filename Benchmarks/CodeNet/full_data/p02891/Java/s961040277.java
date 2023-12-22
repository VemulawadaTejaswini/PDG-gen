import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int K = sc.nextInt();
		char s1 = S.charAt(0);
		char tmp = S.charAt(0);
		long count = 0;
		for(int i = 1; i < S.length();i++) {
			if(tmp == S.charAt(i)) {
				count++;
				tmp = '0';
			}else {
				tmp = S.charAt(i);
			}
		}
		count = count * K;
		System.out.println(count);
	}

}
