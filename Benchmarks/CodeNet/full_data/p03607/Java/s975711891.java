
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();
			if (set.contains(m)) {
				a[i]++;
			} else {
				set.add(m);
			}
		}
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0 &&(a[i] % 2 != 0)) {//偶数次说明不在场馆
				count++;
			}

		}
		System.out.println(set.size()-count);
	}
}
