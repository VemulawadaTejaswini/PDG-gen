import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int result[] = new int[200000];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			result[A[i]+1]++;
		}
		for(int i=0;i<N;i++) {
			result[A[i]]++;
		}
		for(int i=0;i<N;i++) {
			result[A[i]+2]++;
		}
		int max =0;
		for(int i=0;i<200000;i++) {
			if (result[i]>max) {
				max = result[i];
			}
		}
		System.out.println(max);
	}
}