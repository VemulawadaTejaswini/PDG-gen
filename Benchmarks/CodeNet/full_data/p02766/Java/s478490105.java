import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int j=0;
		
		for(int i=0;Math.pow(K, i)<N;i++) {
			j++;
		}
		System.out.println(j);
	}
}
