import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), T = sc.nextInt();
		Map<Integer,Integer> map = new TreeMap<>();
		for(; n > 0; n--) {
			int c = sc.nextInt(), t = sc.nextInt();
			if(t <= T) {
				map.put(c, t);
			}
		}
		List<Integer> list = new ArrayList<>(map.keySet());
		if(list.size() == 0)System.out.println("TLE");
		else System.out.println(list.get(0));
	}
}