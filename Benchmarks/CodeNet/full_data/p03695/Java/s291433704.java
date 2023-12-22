import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int color[] = new int[8];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if(a[i] < 400) {
				color[0]++;
			} else if(a[i] < 800) {
				color[1]++;
			} else if(a[i] < 1200) {
				color[2]++;
			} else if(a[i] < 1600) {
				color[3]++;
			} else if(a[i] < 2000) {
				color[4]++;
			} else if(a[i] < 2400) {
				color[5]++;
			} else if(a[i] < 2800) {
				color[6]++;
			} else {
				color[7]++;
			}
		}
		
		int sum = 0;
		for(int i = 0; i < 7; i++) {
			if(color[i] > 0) {
				sum++;
			}
		}
		if(sum == 0) {
			sum = 1;
		}
		int min = sum;
		int max = sum + color[7];
		
		System.out.println(min + " " + max);
	}
}
