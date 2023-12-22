import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long A = sc.nextLong();
		Long B = sc.nextLong();

		Long na1 = 0L;
		Long na2 = 0L;
		
		if ((N % (A+B)) <= A){
			na1 = (N / (A+B)) * A;
			na2 = N % (A+B);
		}else {
			na1 = (N / (A+B)) * A;
			na2 = A;
		}
		
		System.out.println(na1 + na2);
		sc.close();
	}
}