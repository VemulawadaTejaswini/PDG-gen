import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[m];
		int count = 0;
		
		for(int i=0;i<m;i++) {
			a[i] = scan.nextInt();
			count += a[i];
		}
		
		if(count > n) {
			System.out.println(-1);
		}else {
			System.out.println(n - count);
		}

	}

}
