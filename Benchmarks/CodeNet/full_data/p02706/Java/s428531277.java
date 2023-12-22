import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int N = a.nextInt();
		int M = a.nextInt();
		Integer[] MArray = new Integer[M];
		for(int i = 0; i < M ; i++) {
			MArray[i] = a.nextInt();
			N -= MArray[i];
		}
		if(N < 0) {
			System.out.println("-1");
		}else {
			System.out.println(N);
		}
	}
}