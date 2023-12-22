import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[5];
		
		a[0] = s.nextInt();
		a[1] = s.nextInt();
		a[2] = s.nextInt();
		a[3] = s.nextInt();
		a[4] = s.nextInt();
		
		int c = 0;
		int n = 0;
		int total = 0;
		
		int loss = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			
			n = a[i] % 10;
			if (n == 0 ) {
				loss = 0;
			} else {
				loss = 10 - n;
			}
			total = total + a[i];
			if(loss > c) {
				total = total + c;
				c = loss;
			} else {
				total = total + loss;
			}
		}
		
		
		System.out.println(total);
		s.close();
		
	}

}
