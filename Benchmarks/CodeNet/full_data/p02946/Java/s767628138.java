import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int K,X;
		K = scanner.nextInt();
		X= scanner.nextInt();
		int xplus=X+K;
		int xminus=X-K;
		for(int i=xminus+1;i<xplus;i++) {
			System.out.print(i);
			if(i != xplus-1) {
			System.out.print(" ");
			}
		}
	}
}