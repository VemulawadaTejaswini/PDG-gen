import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			int q = sc.nextInt();
						
			int tn =0;
			
			for(int i=0;i<q;i++) {
				int t=sc.nextInt();
				if(t==1) {
					tn++;
				}else {
					int f = sc.nextInt();
					String c =sc.next();
					if(f==2) {
						s = s.concat(c);
						
					}else {
						s=c.concat(s);
					}
				}
			}
			
			if(tn%2==0) {
				System.out.println(s);
			}else {
				StringBuffer str = new StringBuffer(s);
				s = str.reverse().toString();
				System.out.println(s);
			}
			
		}

	}