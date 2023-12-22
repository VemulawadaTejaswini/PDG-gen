import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = new int[4];
		for(int i = 0;i < 6;i++) {
			int c = scn.nextInt();
			a[c-1]++;
		}
		boolean ans = true;
		for(int i = 0;i < 4;i++) {
			if(a[i]==1 || a[i] == 2) {
			}else {
				ans = false;
			}
		}
		System.out.println(ans?"YES":"NO");
	}

}
