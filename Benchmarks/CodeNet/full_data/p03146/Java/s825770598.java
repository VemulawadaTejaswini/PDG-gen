import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		long ans = 0l;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(s);
		for(int i = 2; i < Integer.MAX_VALUE; i++) {
			int x = 0;
			if(s%2 == 0) {
				x = s/2;
			}else {
				x = (3*s)+1;
			}
			if(list.contains(x)) {
				ans = i;
				break;
			}else {
				list.add(x);
				s = x;
			}
		}
		System.out.println(ans);
	}
}
