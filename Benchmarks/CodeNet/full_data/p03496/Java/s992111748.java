import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = -1000001;
		int max_num = 0;
		int min = 1000001;
		int min_num = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i] > max) {
				max = a[i];
				max_num = i;
			}
			if(a[i] < min) {
				min = a[i];
				min_num = i;
			}
		}
		int max_abs = Math.max(Math.abs(max), Math.abs(min));
		System.out.println((n-1)*2);
		int aa = 0;
		if(max_abs == Math.abs(max))aa=max;
		else if(max_abs == Math.abs(min))aa = min;
		
		if(max_abs == Math.abs(max)) {
			for(int i = 0; i < n; i++) {
				if(max_num == i)continue;
				System.out.println((max_num+1) + " " + (i+1));
			}	
		}else if(max_abs == Math.abs(min)) {
			for(int i = 0; i < n; i++) {
				if(min_num == i)continue;
				System.out.println((min_num+1) + " " + (i+1));
			}	
		}
		
		if(aa >= 0) {
			for(int i = 0; i < n-1; i++) {
				System.out.println((i+1) + " " + (i+2));
			}
		}else {
			for(int i = n-1; i > 0; i--) {
				System.out.println((i+1) + " " + i);
			}
		}
			
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}