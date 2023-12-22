
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Long> red = new ArrayList<>();
		List<Long> green = new ArrayList<>();
		List<Long> no = new ArrayList<>();
		for(int i = 0; i < a; i++) {
			red.add(sc.nextLong());
		}
		for(int i = 0; i < b; i++) {
			green.add(sc.nextLong());
		}
		for(int i = 0; i < c; i++) {
			no.add(sc.nextLong());
		}
		Collections.sort(red);
		Collections.reverse(red);
		Collections.sort(green);
		Collections.reverse(green);
		Collections.sort(no);
		Collections.reverse(no);
		List<Long> eat = new ArrayList<>();
		for(int i = 0; i < x; i++) {
			eat.add(red.get(i));
		}
		for(int i = 0; i < y; i++) {
			eat.add(green.get(i));
		}
		Collections.sort(eat);
		for(int i = 0; i < no.size(); i++) {
			if(eat.get(i) < no.get(i)) {
				eat.set(i, no.get(i));
			} else {
				break;
			}
		}
		long ans = 0;
		for(Long e : eat) {
			ans += e;
		}
		System.out.println(ans);

	}

}
