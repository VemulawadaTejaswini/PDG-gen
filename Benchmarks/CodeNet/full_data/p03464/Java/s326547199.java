import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] a = new int[k];
		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		if(a[k-1]!=2)System.out.println("-1");
		else System.out.println("にゃーん");
	}
}