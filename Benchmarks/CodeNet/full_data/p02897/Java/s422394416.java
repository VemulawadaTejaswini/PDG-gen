import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		System.out.println(N % 2 == 0 ? 0.5 : (int)(N+1)/2/N);

	}

}
