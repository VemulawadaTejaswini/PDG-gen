import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		int x = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1));
		for (int i = 0; i < n; i++) {
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(new Integer(0));
			tmp.addAll(list);
			tmp.add(new Integer(1));
			tmp.addAll(list);
			tmp.add(new Integer(0));
			list = tmp;
		}
		int total = 0;
		for (int i = 0; i < x; i++) {
			total += list.get(n - i - 1).intValue();
		}
		System.out.println(total);
	}
}