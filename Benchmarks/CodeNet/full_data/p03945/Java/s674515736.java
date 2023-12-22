import java.util.*;

public class Main {
    static long total = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] != arr[i - 1]) {
		        count++;
		    }
		}
		System.out.println(count);
	}
}
