import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] n_k=sc.nextLine().split(" ");
		int k=Integer.parseInt(n_k[1]);
		List<Integer> balls=Arrays.asList(sc.nextLine().split(" "))
				.parallelStream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		Map<Integer,Long> ballmap=new HashMap<Integer, Long>();
		Set<Integer> setBall=balls.parallelStream().collect(Collectors.toSet());
		for(Integer i:setBall) {
			ballmap.put(i, balls.parallelStream().filter(j->j==i).count());
		}
		List<Long> listCount=ballmap.values().stream().sorted().collect(Collectors.toList());
		int result=0;
		for(int nowK=setBall.size();nowK>k;nowK--) {
			result+=listCount.remove(0);
		}
		System.out.println(result);
	}
}