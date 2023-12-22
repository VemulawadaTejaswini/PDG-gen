import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = 0;
		int b = 0;
		int K = 0;
		for(K = 0; K <= 1000000000; K++){
			a = A - K;
			b = B - K;
			if(a < 0){
				a = a * -1;
			}
			if(b < 0){
				b = b * -1;
			}
			if(a == b){
				System.out.println(K);
				break;
			}
		}
		if(a != b){
			System.out.println("IMPOSSIBLE");
		}
	}
}
