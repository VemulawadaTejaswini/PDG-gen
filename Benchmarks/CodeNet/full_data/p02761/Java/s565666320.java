import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];Arrays.fill(a, -1);
		boolean flag = true;
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt()-1;
			if(a[s]==-1)a[s] = sc.nextInt();
			else {
				if(a[s] == sc.nextInt())continue;
				else flag = false;
			}
		}
		if(a[0]==0||!flag)System.out.println(-1);
		else {
			for (int i = 0; i < n; i++) {
				if(a[i]!=-1)System.out.print(a[i]);
				else{
					if(i!=0)System.out.print(0);
					else System.out.print(1);
				}
			}
		}
		sc.close();
	}
}