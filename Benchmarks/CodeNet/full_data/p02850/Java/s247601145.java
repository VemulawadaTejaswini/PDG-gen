import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N+1];
		int max = 0;
		List<Integer> resultList = new ArrayList<Integer>();
		for (int i=0;i<N-1;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			a[start] ++;
			a[end] ++;
			if (a[start]>max) {
				max = a[start];
			}
			resultList.add(a[start]);
		}
		System.out.println(max);
		for (int i=0;i<resultList.size();i++) {
			System.out.println(resultList.get(i));
		}
	}
}