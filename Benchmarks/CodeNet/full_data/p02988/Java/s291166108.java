import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];
		for (int i=0;i<N;i++) {
			p[i] = sc.nextInt();
		}
		int count =0;
		for (int i=1;i<N-1;i++) {
			if (((p[i]>p[i-1])&&(p[i]<p[i+1]))||(p[i]<p[i-1])&&(p[i]>p[i+1])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
