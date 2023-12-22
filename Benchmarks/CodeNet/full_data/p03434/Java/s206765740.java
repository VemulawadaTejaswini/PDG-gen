import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] a = new Integer[n];
		List<Integer> alice = new ArrayList<Integer>();
		List<Integer> bob = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int countAli=0;
		int countBob=0;
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				alice.add(a[i]);
				countAli = countAli + a[i];
			}else {
				bob.add(a[i]);
				countBob = countBob+a[i];
			}
		}
		//System.out.println(alice);
		//System.out.println(bob);
		System.out.println(countAli-countBob);

	}

}
