import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		for(int i = 0; i < n;i++){
			long a = scan.nextLong();
			if(map.get(a) == null) {
				map.put(a, 0);
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
