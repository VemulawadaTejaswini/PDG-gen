import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		if(N % 100 == 0) {
			N += 1;
		}
		int Num = N * (int)Math.pow(100, D);
		System.out.println(Num);
	}
}