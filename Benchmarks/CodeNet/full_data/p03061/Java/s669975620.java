import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int max;
	public static List<Integer> a;
	public static int result;
	public static boolean end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new ArrayList();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		max = Collections.max(a);
		result = 1;
		end = false;
		int min = Collections.min(a);
		calc(0, 0, min);
		System.out.println(result);
	}
	
	public static int calc (int i, int count, int num) {
		if (num > max) {
			return count;
		} else {
			if (end) {
				return 0;
			}
			if (count >= a.size() - 1) {
				result = num;
				end = true;
				return calc(0, 0, --num);
			} else {
				if (i >= a.size()) {
					return calc(0, 0, --num);
				} else {
					if (a.get(i) % num == 0) {
						++count;
					}
					return calc(++i, count, num);
				}
			}
		}
	}
}