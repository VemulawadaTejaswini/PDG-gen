import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		Arrays.sort(arr);
		if (arr[0] == arr[1] && arr[2] == arr[3] && arr[1] != arr[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
