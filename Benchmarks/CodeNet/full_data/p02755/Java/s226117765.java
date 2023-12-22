import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int i = 0;
		int a_tax = (int)(i * 0.08);
		int b_tax = (int)(i * 0.1);
		int ans = -1;
		while( i < 1000){
			i++;
			a_tax = (int)(i * 0.08);
			b_tax = (int)(i * 0.1);
			if (a_tax == A && b_tax == B){
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}