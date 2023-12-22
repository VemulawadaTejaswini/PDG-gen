import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(a[0]);
		
		int lr = 0;
		for (int i = 1; i < n; i++) {
			if (lr == 0) {
				list.addFirst(a[i]);
			} else {
				list.add(a[i]);
			}
			lr ^= 1;
		}
		
		while (!list.isEmpty()) {
			int num;
			if (lr == 1)
				num = list.poll();
			else
				num = list.pollLast();
			System.out.print(num + " ");
		}
		System.out.println();
		
		sc.close();
	}
}


