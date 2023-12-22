import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[5];
		for(int i=0; i<N; i++) {
			String s = sc.next();
			if(s.charAt(0) == 'M') {
				n[0]++;
			} else if(s.charAt(0) == 'A') {
				n[1]++;
			} else if(s.charAt(0) == 'R') {
				n[2]++;
			} else if(s.charAt(0) == 'C') {
				n[3]++;
			} else if(s.charAt(0) == 'H') {
				n[4]++;
			}
		}
		
		long count = 0;
		for(int i=0; i<5; i++) {
			int a = n[i];
			for(int j = i+1; j<5; j++) {
				int b = n[j];
				for(int k = j+1; k<5; k++) {
					int c = n[k];
					count += 1L * a*b*c;
				}
			}
		}
		
		
		System.out.println(count);
		
		
		
	}

}
