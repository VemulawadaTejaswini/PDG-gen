import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] start = new int[m];
		int[] goal = new int[m];
		int sbuf = 0;
		int gbuf = 0;
		for(int i=0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int counter = 0;
		for(int i=0; i < m; i++) {
			if(a[i]==1 || b[i]==n) counter++;
		}
		int[] ax = new int[counter];
		int[] bx = new int[counter];
		int num = 0;
		for(int i=0; i < m; i++) {
			if(a[i]==1 || b[i]==n) {
				ax[num] = a[i];
				bx[num] = b[i];
				num++;
			}
		}
		int possible=0;
		for(int i=0; i < counter; i++) {
			for(int j=0; j < counter; j++) {
				if(ax[i] == bx[j]) possible = 1;
			}
		}
		if(possible == 1) System.out.println("POSSIBLE");
		else System.out.println("IMPOSSIBLE");
	}
}