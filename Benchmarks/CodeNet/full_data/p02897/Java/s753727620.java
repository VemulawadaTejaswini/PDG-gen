import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N%2==1?(N/2+1)/(double)N:0.5);
	}
}