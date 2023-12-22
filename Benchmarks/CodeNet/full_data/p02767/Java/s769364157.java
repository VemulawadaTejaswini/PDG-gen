import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = 0;
		for(int i = 0;i < N;i++) {
			int X = sc.nextInt();
			total += (int) Math.pow(X - N,2);
		}
		System.out.println(total);
	}
}