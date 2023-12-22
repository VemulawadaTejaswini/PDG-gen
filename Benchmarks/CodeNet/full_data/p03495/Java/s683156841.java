import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		List<Integer> list = new ArrayList<>();
		int num = a[0];
		int count = 1;
		for(int i=1;i<n;i++) {
			if(a[i]==num) count++;
			else {
				list.add(count);
				num = a[i];
				count = 1;
			}
		}
		list.add(count);
		list.sort(Comparator.naturalOrder());
		int variation = list.size();
		if(variation<=k) System.out.println(0);
		else {
			int sum = 0;
			for(int i=0;i<variation-k;i++) {
				sum += list.get(i);
			}
			System.out.println(sum);
		}
		in.close();
	}

}
