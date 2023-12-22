import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(m == 0) {
			System.out.println(-1);
			return;
		}
		
		Integer array[] = new Integer[3];
		for(int i = 0; i < 3; i++) {
			array[i] = -1;
		}
		
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int c = scan.nextInt();
			if(n < s) {
				System.out.println(-1);
				return;
			}
			if(n != 1 && s == 1 && c == 0) {
				System.out.println(-1);
				return;			}
			if(array[s-1] == -1) {
				array[s-1] = c;
			} else if(array[s-1] != c) {
				System.out.println(-1);
				return;			
			}
		}

		for(int i = 0; i < 3; i++) {
			if(n != 1 && i == 0 && array[0] == -1) {
				array[i] = 1;
			}
			if(array[i] == -1){
				array[i] = 0;
			}
		}
		int num = 0;
		for(int i = 0;i < n;i++) {
	    	if(i != 0) {
	    		num = num*10;
	        }
	    	num = num + array[i];
	    }
		System.out.println(num);
		return;
		
	}
}