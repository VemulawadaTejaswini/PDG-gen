
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		int q        = Integer.parseInt(tmp[1]);
		char[] s     = scanner.nextLine().toCharArray();
		int[]  sum   = new int[n];


		for(int i = 1; i < n; i++) {

			if(s[i - 1] == 'A' && s[i] =='C') {

				sum[i]++;
			}

			sum[i] += sum[i - 1];
		}

		for(int i = 0; i < q; i++) {

			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;

			System.out.println(sum[b] - sum[a]);
		}

	}

}
