import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		ArrayList<Integer>a2 = new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			if(i%2==0) {
				a1.add(v);
			} else {
				a2.add(v);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		if(n%2==1) {
			Collections.reverse(a1);
			ans.addAll(a1);
			ans.addAll(a2);
		} else {
			Collections.reverse(a2);
			ans.addAll(a2);
			ans.addAll(a1);
		}
		for(int i=0; i<ans.size(); i++) {
			if(i>0)System.out.print(" ");
			System.out.print(ans.get(i));
		}
		System.out.println();
		sc.close();
	}
}
