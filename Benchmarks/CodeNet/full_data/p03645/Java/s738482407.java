import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> goList = new ArrayList<Integer>();
		List<Integer> arriveList = new ArrayList<Integer>();
		for (int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==1) {
				goList.add(b);
			} else if (b==N) {
				arriveList.add(b);
			}
		}
		for (Integer in : goList) {
			if (arriveList.contains(in)==true) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}