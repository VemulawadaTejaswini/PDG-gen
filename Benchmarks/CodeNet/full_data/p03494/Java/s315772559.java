import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		long[] A = new long[N];
		int answer = 0;
		boolean run = true;

		for(int i = 0; i < N; i++){
			A[i] = sc.nextLong();
		}

		while(run){
			for(int i = 0; i < N; i++){
				if(A[i] % 2 != 0){
					run = false;
					break;
				}else{
					A[i] /= 2;
				}
			}
			answer++;
			//System.out.println(answer);
		}
		System.out.println(answer-1);
	}
}