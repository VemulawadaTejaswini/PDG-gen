//package atCoder;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Vector<Integer> cards = new Vector<Integer>(n);
		int i,j;
		for(i=0;i<n;i++) {
			int num = sc.nextInt();
			for(j=0;j<i;j++) {
				if(num > cards.get(j)) {
					cards.add(j,num);
					break;
				}
			}
			if(j==i)
				cards.add(num);
		}

		//Integer[] process = cards.toArray(new Integer[0]);

		for(i=0;i<m;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(c>cards.get(n-1)) {
				for(j=0;j<n;j++) {
					if(c > cards.get(j)) {
						for(int k=0;k<b;k++)
							cards.add(j,c);
						break;
					}
				}
			}
		}
		sc.close();

		long sum = 0;
		for(i=0;i<n;i++)
			sum += cards.get(i);

		System.out.println(sum);
	}
}
