import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int x = s.nextInt();
		int[] a = new int[2 * N];
		int[] a2 = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
			a[N + i] = a[i];
		}

		int min = a[0];
		int minno = 0;
		for (int i = 1; i < N; i++) {
			min = Math.min(min, a[i]);
			if (min == a[i]) {
				minno = i;
			}
		}

		long t = a[minno];
		int count = 0;
		int countm = 0;
		a2[minno] = a[minno];

		for (int i = minno + 1; i < minno + N; i++) {
			if (a[i] <= t + x) {
				count = 0;
				t = a[i];
			} else {
				count++;
				t = t + x;
			}
			if (count > countm) {
				countm = count;
			}
		}

		for (int i = 0; i < N; i++) {
			min = a[i];
			if (i >= countm) {
				for (int j = i - countm; j < i; j++) {
					min = Math.min(min, a[j]);
				}
				a2[i]=min;
			}else{
				for(int j=N+i-countm;j<i+N;j++){
					min = Math.min(min, a[j]);
				}
				a2[i]=min;
			}
		}

		long result = (long) countm * x;
		for (int i = 0; i < N; i++) {
			result += (long) a2[i];
		}
		System.out.println(result);
	}
}