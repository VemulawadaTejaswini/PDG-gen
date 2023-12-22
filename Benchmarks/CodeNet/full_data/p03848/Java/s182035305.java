import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			A[temp]++;
		}
		for (int i=0;i<N;i++) {
			if (N%2==0) {
				if (i%2==1&&A[i]!=2) {
					System.out.println(0);
					return;
				}
				if (i%2==0&&A[i]!=0)  {
					System.out.println(0);
					return;
				}
			} else {
				if (i==0&&A[i]!=1) {
					System.out.println(0);
					return;
				}
				if (i%2==1&&A[i]!=0) {
					System.out.println(0);
					return;
				}
				if (i>0&&i%2==0&&A[i]!=2)  {
					System.out.println(0);
					return;
				}
			}
		}
		long count =1;
		for (int i=0;i<N/2;i++) {
			count = (count*2)%1000000007;
		}
		System.out.println(count);
	}
}