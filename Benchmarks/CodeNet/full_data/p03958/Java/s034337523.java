import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// get two integers separated with half-width break
		int k = sc.nextInt();
		int t = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < t; i++) {
			int temp = sc.nextInt();
			a.add(temp);
		}

		if (t == 1) {
			System.out.println(k - 1);
		} else if(t == k){
			System.out.println(0);
		}
		else {
			int max = Collections.max(a);
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) == max) {
					a.remove(i);
					break;
				}
			}
			for (int i = 0; i < a.size(); i++) {
				
				max = Math.abs((max - a.get(i)));
			}
			System.out.println(max - 1);
		}
	}

}
