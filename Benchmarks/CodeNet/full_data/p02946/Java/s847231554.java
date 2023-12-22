import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int K=scn.nextInt();
		int X=scn.nextInt();
		for(int i=-100;i<300;i++) {
			if((X-K)<i&&(X+K)>i) {
				System.out.print(i+" ");
			}
		}
	}

}
