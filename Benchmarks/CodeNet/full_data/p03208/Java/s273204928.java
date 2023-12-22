import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>;
		int n = sc.nextInt();
		int k = sc.nextInt();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			l.add(a);
		}
		Collections.sort(a);
		int min = 1000000000;
		for (int i=0 ; i++ ; i < l.size() - k) {
			int sabun = l.get(i+k) - l.get(i);
			if (sabun < min) min = sabun;
		}
		// 出力
		System.out.println(min);
	}
}
