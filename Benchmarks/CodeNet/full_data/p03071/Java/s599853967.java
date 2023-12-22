import java.util.*;

public class Main {
	public static int a, b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			if(a >= b) {
				sum+=a;
				a--;
			}else {
				sum+=b;
				b--;
			}
		}
		
		System.out.println(sum);
	  }
}
