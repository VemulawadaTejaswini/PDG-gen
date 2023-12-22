
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextLong());
		}
		List<Set<Long>> numcd = new ArrayList<>();
		for(Long num : list) {
			Set<Long> tmp = new HashSet<>();
			for(long i = 1; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					tmp.add(i);
					tmp.add(num / i);
				}
			}
			numcd.add(tmp);
		}
		List<OptionalLong> allcd = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			List<Set<Long>> tmp = new ArrayList<>();
			tmp.addAll(numcd);
			tmp.remove(i);
			Set<Long> tmpcd = new HashSet<>();
			tmpcd.addAll(tmp.get(0));
			for(int j = 1; j < N - 1; j++) {
				tmpcd.retainAll(tmp.get(j));
			}
			OptionalLong maxcd = tmpcd.stream().mapToLong(n -> n).max();
			allcd.add(maxcd);
		}
		long ans = 0;
		for(OptionalLong cd : allcd) {
			ans = Math.max(ans, cd.orElse(0));
		}
		System.out.println(ans);

	}

}
