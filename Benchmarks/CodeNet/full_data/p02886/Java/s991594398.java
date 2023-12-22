import java.util.Scanner;

public class Main {
	public  static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int i;
		int j;
		int sum = 0;
		int H [] = new int[N] ;

		for(i =0;i < N;i++) {
			int B = sc.nextInt();
			H[i] = B;
		}

		for(i = 0;i < N;i++) {
			for(j = i+1;j < N ; j++) {
				sum = sum + H[i]*H[j];

			}
		}
		System.out.println(sum);
	}
}