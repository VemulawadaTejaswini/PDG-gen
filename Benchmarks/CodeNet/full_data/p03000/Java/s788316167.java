import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		int[] D = new int[N];
		int s = 0;
		int a = 0;
		for(int i = 0; i<N; i++) {
			L[i] = sc.nextInt();
			if(i==0) {
				D[i] = 0;
			}else {
				D[i] = L[i-1];
			}
		}
		sc.close();
		for(int i = 0; i<N; i++) {
			a += D[i];
			if(a>X) {
				break;
			}
			s++;
		}
		System.out.println(s);
	}

}