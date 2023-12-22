
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] list = new int[n];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
			sum += list[i];
			min = Math.min(min, list[i]);
		}
		
		int cnt = (x - sum) / min;
		System.out.println(cnt + n);
		
	}
}