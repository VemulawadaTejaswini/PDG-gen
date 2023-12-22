import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n  = Integer.parseInt(tmp[0]);
		int k  = Integer.parseInt(tmp[1]);
		Long a = Long.MAX_VALUE;
		int[] lst = new int[n];
		String[] tmp2 = scanner.nextLine().split(" ");

		for(int i = 0; i < n; i++) {

			lst[i] = Integer.parseInt(tmp2[i]);
		}

		for(int i = 0; i < (n - k + 1); i++) {

			int r = i + k - 1;

			long temp = Math.min(Math.abs(lst[i]) + Math.abs(lst[i] - lst[r]),Math.abs(lst[r]) + Math.abs(lst[i] - lst[r]));
			a = Math.min(temp, a);

		}
		System.out.println(a);
	}
}
