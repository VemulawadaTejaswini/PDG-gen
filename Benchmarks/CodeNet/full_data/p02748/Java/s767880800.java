import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Integer[] a = new Integer[A];
		Integer[] b = new Integer[B];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		Arrays.setAll(b, i -> Integer.parseInt(sc.next()));
		List<Integer> listA = new ArrayList<>(Arrays.asList(a));
		List<Integer> listB = new ArrayList<>(Arrays.asList(b));
		int waribiki = Integer.MAX_VALUE;
		for(int i=0; i<M; i++){
			int x = listA.get(Integer.parseInt(sc.next()) - 1);
			int y = listB.get(Integer.parseInt(sc.next()) - 1);
			int c = Integer.parseInt(sc.next());
			if(x + y - c < waribiki){
				waribiki = x + y - c;
			}
		}
		listA.sort(Comparator.naturalOrder());
		listB.sort(Comparator.naturalOrder());
		int min = listA.get(0) + listB.get(0);
		
		System.out.println(min < waribiki ? min : waribiki);
	}
}
