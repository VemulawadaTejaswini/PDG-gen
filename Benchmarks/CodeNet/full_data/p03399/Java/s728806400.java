import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		int ans = 0;
		if (A<=B){
			ans += A;
		}else{
			ans += B;
		}
		if (C<=D){
			ans += C;
		}else{
			ans += D;
		}
		System.out.println(ans);
	}

}