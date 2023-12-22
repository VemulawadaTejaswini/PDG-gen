
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, a[], min, max = 0, count = 1;
		
		n = sc.nextInt();
		t = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		min = 2000000000;
		for(int i = 0; i < n; ++i) {
			if(min > a[i]) {
				min = a[i];
			}
			if(max < a[i] - min) {
				count = 1;
				max = a[i] - min;
			}
			else if(max == a[i] - min)++count;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
