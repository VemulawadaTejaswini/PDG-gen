import java.util.Scanner;

public class Main {
	public static int T = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		long a[][] = new long[T][4];
		for(int i = 0;i < T;i++) {
			for(int j = 0;j < 4;j++) {
				a[i][j] = scan.nextLong();
			}
		}
		
		
		
		for(int i = 0;i < T;i++) {
			long k[]={};
			int j = 0;
			if(a[i][0] - a[i][1] >= 0) {
				a[i][0] -= a[i][1];
				
				k[j] = a[i][0];
				j++;
				for(int l = 0;l < k.length - 1;l++) {
					if(k[l] == k[k.length - 1]) {
						System.out.println("Yes");
						break;
					}
				}
				
				if(a[i][0] <= a[i][2]) {
					a[i][0] += a[i][3];
				}
			}else {
				System.out.println("No");
			}
			
		}
		
		
		
		scan.close();
	}
}