import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arrA = sc.next().toCharArray();
		char[] arrB = sc.next().toCharArray();
		char[] arrC = sc.next().toCharArray();
		if (arrA[arrA.length - 1] == arrB[0] && arrB[arrB.length - 1] == arrC[0]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
