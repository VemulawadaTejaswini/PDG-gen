import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		char prev = 'X';
		int count = 0;
		for (char c : arr) {
		    if (c != prev) {
		        count++;
		        prev = c;
		    }
		}
		System.out.println(count);
	}
}
