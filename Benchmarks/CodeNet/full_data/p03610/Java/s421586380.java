import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		for(int i = 0; i < s.length; i++) {
			if(i%2 ==0) sb.append(s[i]);
		}
		System.out.println(new String(sb));
		sc.close();

	}

}