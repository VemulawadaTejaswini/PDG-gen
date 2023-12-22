import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int max = 0;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len - max + 1; ) {
				int count = 0;
				while (j + count < len && arr[i + count] == arr[j + count] && i + count < j) {
					count++;
				}
				max = Math.max(count, max);
				if (count == 0) {
					j++;
				} else {
					j ++;
				}
			}
		}
		System.out.println(max);
	}
}
