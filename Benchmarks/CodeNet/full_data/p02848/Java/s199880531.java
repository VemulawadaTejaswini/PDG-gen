import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = (char)((arr[i] - 'A' + n) % 26 + 'A');
		}
		System.out.println(arr);
	}
}
