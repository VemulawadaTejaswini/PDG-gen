import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = Math.max(A+B, Math.max(A-B, A*B));

		System.out.println(ans);
	}
}

