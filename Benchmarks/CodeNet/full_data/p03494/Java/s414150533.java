import java.util.*;

class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int min = 30;
	int count = 0;
	for(int i=0; i<N; i++) {
		int[] A = new int[201];
		A[i] = sc.nextInt();
		int a = A[i];
		while(a % 2 == 0) {
			a /= 2;
			count++;
		}
		if(count<min) {
			min = count;
		}
		count = 0;
	}

	System.out.println(min);
	}
}