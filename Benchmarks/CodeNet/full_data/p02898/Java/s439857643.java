import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] a = new int[N];
		int c = sc.nextInt();
		for(int i = 0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int count = 0;
		for(int b : a) {
			if(b>=c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
