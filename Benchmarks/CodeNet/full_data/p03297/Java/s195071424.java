import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int T=sc.nextInt();
			long a, b, c, d, e=0;
			
			for(int i=0; i<T; i++) {
				a=sc.nextLong();
				b=sc.nextLong();
				c=sc.nextLong();
				d=sc.nextLong();
				long A=a;
				boolean tf=false;
				long count=0;
				while(true) {
					if(a<b) {
						tf=false;
						break;
					}
					if(count>0 && a==A) {
						tf=true;
						break;
					}
					e=a%b;
					if(e<=c) {
						a=e+d;
					}
					else if(e>c) {
						a=e;
					}
					count++;
				}
				System.out.println(tf? "Yes":"No");
				
				
			}
			
			
		}
	}
}