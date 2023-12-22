
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(a);
		Arrays.sort(b);

		
		int max = a[n-1];
		
		int hp = h;
		int cnt = 0;
		
		for(int i = 0 ; i < n ;i++) {
			if(max < b[i]) {
				hp = hp - b[i];
				cnt++;
			}
		}
		double p = (double)hp/max;
		
		cnt += (int)Math.ceil(p);
		
		System.out.println(cnt);
		
		
	}

}
