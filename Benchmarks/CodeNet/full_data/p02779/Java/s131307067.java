import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		boolean flag = true;
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a);
		for(int i = 0; i < n-1; i++) {
			if(a.get(i)==a.get(i+1)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
