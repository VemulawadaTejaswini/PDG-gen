import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		int left =  0;
		int right = 0;
		for(int i=0;i<2;i++) {
			left += sc.nextInt();
		}
		for(int i=0;i<2;i++) {
			right += sc.nextInt();
		}
		if(left==right) out.println("Balanced");
		else if(left>right) out.println("Left");
		else out.println("Right");
	}
	
	
	//各桁の和を計算
	public static int calcsumo(int x) {
		String s = String.valueOf(x);
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			sum += Character.getNumericValue((s.charAt(i)));
		}
		return sum;
	}
	public static void B(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			int temp = calcsumo(i);
			if(temp>=A && temp<=B) sum+=i;
		}
		out.println(sum);
	}
}
