import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n, k;
		n = scan.nextInt();
		k = scan.nextInt();
		
		System.out.print((int)(k * Math.pow(k-1, n-1)));
		
	}
}