import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = N;
		int max  = 0;
		int keta  = 0;
		int a[] = new int[3];
		for(int i = 2;0 <= i;i--) {
			a[i] = (int)Math.pow(10, i);
			keta  = n/a[i];
			n = n - a[i] * keta;
			if(max < keta) {
				max = keta;
			}
		}
		System.out.println(max+""+max+""+max);
		sc.close();
	}
}