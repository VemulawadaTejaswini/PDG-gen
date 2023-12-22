import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
		    char[] org = sc.next().toCharArray();
		    Arrays.sort(org);
		    arr[i] = new String(org);
		}
		Arrays.sort(arr);
		long total = 0;
		long count = 1;
		String prev = "";
		for (int i = 0; i < n; i++) {
		    if (prev.equals(arr[i])) {
		        count++;
		    } else {
		        total += count * (count - 1) / 2;
		        count = 1;
		        prev = arr[i];
		    }
		}
		total += count * (count - 1) / 2;
		System.out.println(total);
   }
}
