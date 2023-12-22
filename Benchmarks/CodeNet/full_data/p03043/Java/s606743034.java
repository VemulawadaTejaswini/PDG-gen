import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			double n = sc.nextDouble();
			double k = sc.nextDouble();
			double ret = 0.00;
			
			for(int i=1;i<=n;i++) {
				if(i>=k) {
					ret+=1.0/n;
				}else {
					int x = (int)((Math.log(k/i)/Math.log(2.0))+1);
					double deno = Math.pow(2,x);
					
					ret+=1.0/(n*deno);
				}
			}
				
			
			System.out.println(ret);
	    }
				
	}
