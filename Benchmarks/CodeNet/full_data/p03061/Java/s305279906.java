
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] as = new int[N];
		
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				as[i] = sc.nextInt();
			}
		}	
		List<Integer> reslist = new ArrayList<Integer>();
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				int r;
				int a = as[i];
				int b = as[j];
				while(b > 0) {
					r = a%b;
					a = b;
					b = r;
				}
				if (!reslist.contains(a)) {
					reslist.add(a);
				}
			}
		}
		reslist.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		int result = 1;
		for (Integer integer : reslist) {
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (as[i]%integer == 0) {
					count++;
				}
			}
			if (count == N || count == N-1) {
				if (integer > result) {
					result = integer;
				}
			}
		}
		System.out.println(result);
	}
	
}