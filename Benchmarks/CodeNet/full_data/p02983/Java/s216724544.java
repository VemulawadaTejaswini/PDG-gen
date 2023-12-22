import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int R = sc.nextInt();
		long min = Long.MAX_VALUE;

		for (int i=L; i<R; i++){
			for (int j=i+1; j<=R; j++){
				min = Math.min(min, (i*j) % 2019);
			}
		}
		System.out.println(min);
	}


}