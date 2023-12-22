import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double a1 =0.08;
		double b1 =0.1;
		double s=0;
		int ans =-1;
		int s1 =0;
		double t =0;
		double t1 =0;
		for(int i=1; i<10000;i++) {
			s=i*0.08;
			s1 =(int)s;
			t=i*0.1;
			t1 =(int)t;
			if(s1==A &&t1==B) {
				ans = i;
				break;
			}
			
			
			
			
			
		}
		System.out.print(ans);

	}
}
