import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int ANS = 0;
		int K2 = K / 2;
		if (K % 2 == 0){
			ANS = K2 * K2;
		}else{
			K2 = K2 + 1;
			ANS = K2 * K2;
			ANS = ANS - K2;
		}
		System.out.println(ANS);
		
	}
}
