import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < n-1; i++) {
			if(a[i] + a[i+1] >= l) {
				System.out.println("Possible");
				for(int j = 0; j < i; j++) {
					System.out.println(j+1);
				}
				for(int j = i+1; j < n-1; j++) {
					System.out.println(j+1);
				}
				System.out.println(i+1);
				return ;
			}
		}
		System.out.println("Impossible");
		return;
	}
	
}