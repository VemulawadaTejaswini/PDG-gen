import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int a = 0;
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();
		int b = 0;
		for(int i=0; i<N; i++) {
			if(b<=H[i]) {
				a++;
				b = H[i];
			}
		}
		System.out.println(a);

	}

}