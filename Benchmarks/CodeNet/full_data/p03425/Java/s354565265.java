
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
		int n = sc.nextInt();
		
		boolean m = true;
		boolean a = true;
		boolean r = true;
		boolean c = true;
		boolean h = true;
		
		int M , A , R , C , H;
		 M = 0;
		 A = 0;
		 R = 0;
		 C = 0;
		 H = 0;
		
		
		for(int i = 0 ; i < n ;i++) {
			String s = sc.next();
			char x = s.charAt(0);
			m = (x == 'M');
			a = (x == 'A');
			r = (x == 'R');
			c = (x == 'C'); 
			h = (x == 'H'); 
			
			if(m) {
				M++;
			}
			if(a){
				A++;
			}
			if(r) {
				R++;
			}
			if(c) {
				C++;
			}
			if(h) {
				H++;
			}
		}
	
		long ans = 0;
		ans += (long)(M * A * (R + C + H));
		ans += (long)(M * R * (C + H));
		ans += (long)(M * C * H);
		ans += (long)(A * R * (C + H));
		ans += (long)(A * C * H);
		ans += (long)(R * C * H);
		
		System.out.println(ans);
}

}
