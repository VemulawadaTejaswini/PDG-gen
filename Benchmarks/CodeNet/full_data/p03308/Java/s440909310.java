import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i = 0;  i < a.length; i++) {
			for(int j = a.length-1; j > i ; j--) {
				if(a[j-1] > a[j]) {
					int tmp = a[j-1];
					a[j-1] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		System.out.println(a[n-1] - a[0]);
	}

}
