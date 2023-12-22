import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		
		List<D> list = new ArrayList<>((int)N);
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			list.add(new D(b,a));
		}
		
		list = list.stream().sorted().collect(Collectors.toList());
		
		
		long sum = 0;
		for (D d : list) {
			if (d.count <= M) {
				M -= d.count;
				sum += d.val * d.count;
			} else {
				sum += d.val * M;
				break;
			}
		}
		
		System.out.println(sum);
	}
	
	static class D implements Comparable<D>{
		long count;
		long val;
		
		D (long count, long val) {
			this.count = count;
			this.val = val;
		}
				
		@Override
		public int compareTo(D o) {
			if (this.val > o.val)
				return 1;
			else if (this.val < o.val)
				return -1;
			
			return 0;
		}
		
		
	}
}
