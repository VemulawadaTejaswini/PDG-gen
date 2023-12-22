import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long A = sc.nextLong();
		Long B = sc.nextLong();

		Long na = 0L;
		Long nb = 0L;
		
		na = (N / (A+B)) * A;
		nb = N % (A+B);
		
		System.out.println(na + nb);
		sc.close();
	}
}