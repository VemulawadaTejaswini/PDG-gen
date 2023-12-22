import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] H = new int[N];
		for(int i=0;i<N;i++) {
			H[i]= sc.nextInt();
		}
		if(K>=N) {
			System.out.println("0");
		} else {
			Arrays.sort(H);
			long ans = 0;
			for(int i=0;i<=N-1-K;i++) {
				ans += H[i];
			}
			System.out.println(ans);
		}


	}
}
