import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] a = new int[N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.nextInt();
		}

		for(int b=1;b<=N;b++) {
	int count = 0;		
			for(int s :a) {
				count++;
				if(b==s) {
				System.out.print(count+" ");
				}
			}
		}
	}

}
