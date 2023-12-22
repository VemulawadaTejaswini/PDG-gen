import java.util.*;

public class Main {
	static final char BIG = (char)('A' - 'a');
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arrA = sc.next().toCharArray();
		char[] arrB = sc.next().toCharArray();
		char[] arrC = sc.next().toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append((char)(arrA[0] + BIG)).append((char)(arrB[0] + BIG)).append((char)(arrC[0] + BIG));
		System.out.println(sb);
	}
}
