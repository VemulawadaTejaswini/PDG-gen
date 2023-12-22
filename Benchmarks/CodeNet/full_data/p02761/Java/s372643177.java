import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(m == 0) {
			System.out.println(-1);
		}
		
		Integer array[] = new Integer[3];
		for(int i = 0; i < 3; i++) {
			array[i] = -1;
		}
		
		boolean er = false;
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int c = scan.nextInt();
			if(array[s-1] == -1) {
				array[s-1] = c;
			} else if(array[s-1] != c) {
				er = true;
				break;
			}
		}
		if(er || 1 < n && array[0] == 0) {
			System.out.println(-1);
		} else {
			for(int i= 0; i < 3; i++) {
				if(array[i] == -1) {
					array[i] = 0;
				}
			}
			int num = 0;
			if(n == 1) {
				num = array[0];
			} else if(n == 2) {
				num = array[1] + array[0] * 10;
			} else {
				num = array[2] + array[1]*10 + array[0]*100;
			}
			System.out.println(num);
		}
	}
}