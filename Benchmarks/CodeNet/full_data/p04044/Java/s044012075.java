import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int l = sc.nextInt();
		int n = sc.nextInt();
		String[] B = new String[n];
		String c = null;
		String A = null;
		String[] d = new String[n];
		for(int i = 0;i < n;i++) {
			A = sc.next();
			B[i] = A.substring(0,1);
			d[i] = A.substring(1,l);
			list.add(B[i]);
			Collections.sort(list);
		}
		c = list.get(0) + d[0];
		for(int j = 1;j < n;j++) {
			c = c + list.get(j) + d[j];
		}
		System.out.println(c);
	}
}
