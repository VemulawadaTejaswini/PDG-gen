import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
		int count = 0;
		for(char c : chars) {
			int i = Integer.parseInt(String.valueOf(c));
			if(i == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}