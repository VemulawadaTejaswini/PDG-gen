import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = 1;
		int count = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (x == target) {
		        target++;
		    } else {
		        count++;
		    }
		}
		if (target == 1) {
		    count = -1;
		}
		System.out.println(count);
	}
}
