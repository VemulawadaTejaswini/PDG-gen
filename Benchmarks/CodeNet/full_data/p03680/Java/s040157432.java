import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 1;
		int index = 1;
		while(count <= n) {
			index = a[index];
			if(index==2) {
				System.out.println(count);
				return;
			}
			count++;
		}
		System.out.println(-1);
	}
}