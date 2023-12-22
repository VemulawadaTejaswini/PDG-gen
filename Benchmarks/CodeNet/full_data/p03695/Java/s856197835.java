import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[8];
		int r = 0, c = 0;
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int index = a[i] / 400;
			for(int j = 0 ; j < 8 ; j++) {
				if(index == j) {
					b[index]++;
					break;
				}
				else if(index == 8) {
					c++;
					break;
				}
			}
		}
		for(int i = 0 ; i < 8 ; i++) {
			if(b[i] != 0) r++;
		}
		int min = Math.max(1, r);
		int max = 0;
		if(min == r) max = c + r;
		else max = c;
		System.out.println(min + " " + max);
	}
}
