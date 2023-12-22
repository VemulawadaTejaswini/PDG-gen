import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		int cnt = 0;
		for(char b:a) {
			if(b == '1') cnt++;
		}
		System.out.println(cnt);
	}
}
