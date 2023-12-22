import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] X = new long[5];
		for (int i=0;i<5;i++) {
			X[i]=sc.nextLong();
		}

		int min=0;
		for (int i=1;i<5;i++) {
			if (X[i]<X[min]) {
				min=i;
			}
		}

		long y;
		if (N<X[min]) {
			y=1;
		} else if (N%X[min]==0) {
			y=N/X[min];
		} else {
			y=N/X[min]+1;
		}
		System.out.println(y+4);
	}
}