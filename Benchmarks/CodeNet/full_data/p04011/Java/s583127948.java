import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int ret = 0;
		for(int i=0; i<N; i++){
			if (i<K){
				ret = ret+X;
			}
			else {
				ret = ret+Y;
			}
		}





		System.out.println(ret);


	}
}
