import java.util.Scanner;
 
public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		Integer array[] = new Integer[3];
		array[0] = -1;
		array[1] = -1;
		array[2] = -1;

		
		boolean er = false;
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int c = scan.nextInt();
			if(s == 1) {
				if(array[0] == -1) {
					array[0] = c;
				} else if(array[0] != c) {
					er = true;
					break;
				}
			} else if(s ==2) {
				if(array[1] == -1) {
					array[1] = c;
				} else if(array[1] != c) {
					er = true;
					break;
				}
			} else {
				if(array[2] == -1) {
					array[2] = c;
				} else if(array[2] != c) {
					er = true;
					break;
				}
			}
		}
		int num = 0;
		if(er || 1 < n && array[0] == 0) {
			num = -1;
		} else {
			for(int i= 0; i < 3; i++) {
				if(array[i] == -1) {
					array[i] = 0;
				}
			}
			if(n == 1) {
				num = array[0];
			} else if(n == 2) {
				num = array[1] + array[0] * 10;
			} else {
				num = array[2] + array[1]*10 + array[0]*100;
			}
		}
		
		System.out.println(num);
	}
}