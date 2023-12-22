import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String moji = sc.next();
		char[] c = moji.toCharArray();
		moji = sc.next();
		char[] d = moji.toCharArray();
		moji = sc.next();
		char[] e = moji.toCharArray();
System.out.println(c[0]+d[1]+e[2]);

	}}