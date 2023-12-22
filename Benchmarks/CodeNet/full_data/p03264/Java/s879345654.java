import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int k = K / 2;
		if(K % 2 == 0) {
			System.out.println(k*k);
		}else {
			System.out.println(k*(k+1));
		}
	}
}