import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int k[] = new int[4];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			k[a[i]]++;
			k[b[i]]++;
		}
		for(int i = 0; i < 4; i++) {
			if(k[i] > 2) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
