import java.util.Scanner;

public class Main {

	public static void reverse(int b[], int a[]) {
		int k = (a.length + 1) / 2;
		int n = a.length;
		for(int i = 0; i < k; ++i) {
			int tmp = n - 2 * i - 1;
			b[i] = a[tmp];
			tmp -= 1;
			if(tmp >= 0)
			b[n - i - 1] = a[tmp];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a[];
		
		n = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		sc.close();
		
		int b[];
		b = new int[n];
		
		reverse(b, a);
		
		for(int i : b)
		System.out.print(i + " ");
		System.out.println();
	}

}
