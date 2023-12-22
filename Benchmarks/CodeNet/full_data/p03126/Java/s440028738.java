import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		int k = stdin.nextInt();
		List<Integer> memo = new ArrayList<Integer>();
		for(int i=0;i<k;i++) {
			memo.add(stdin.nextInt());
		}
		for(int j=0;j<n-1;j++) {
			List<Integer> a = new ArrayList<Integer>();
			k = stdin.nextInt();
			for(int l=0;l<k;l++) {
				a.add(stdin.nextInt());
			}
			memo.retainAll(a);
		}
		System.out.println(memo.size());
	}

}
