import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,R;
		N= sc.nextInt();
		R= sc.nextInt();
		int i=0;
		for (i=1;i<100;i++) {
			N=N/R;
			if (N==0) {
				System.out.println(i);
				return;
			}
		}
	}

}