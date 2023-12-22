import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		String line = sc.nextLine();
		String[] B = line.split(" ");
		int value=0;
		int result=0;
		
		for(int i=0;i<N;i++) {
			value=0;
			line = sc.nextLine();
			String[] A = line.split(" ");
			for(int j=0;j<M;j++) {
				value += Integer.parseInt(A[j]) * Integer.parseInt(B[j]);
			}
			if(value + C > 0) result++;
		}
		System.out.println(result);
	}
}