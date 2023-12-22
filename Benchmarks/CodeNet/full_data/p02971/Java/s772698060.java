import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void a() {
		int r = sc.nextInt();
		System.out.println(3 * r  * r);
	}
	
	void b() {
		int n = sc.nextInt(),d = sc.nextInt();
		int range = d * 2 + 1;
		if(n % range == 0) System.out.println(n / range);
		else System.out.println(n / range + 1);
	}
	
	void c() {
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0;i < n;i ++) {
			a.add(sc.nextInt());
		}
		for(int i = 0;i < n;i ++) {
			int removenum = a.get(0);
			a.remove(0);
			System.out.println(Collections.max(a));
			a.add(removenum);
		}
	}

	public static void main(String[] args) {
		new Main().c();
	}

}
