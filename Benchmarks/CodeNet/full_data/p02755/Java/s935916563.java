import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		double c = a/0.08;
		double cc = (a*100+7)/8;

		double d = b/0.1;
		double dd = (b*100+9)/10;
		
		boolean flag = true;
		
		Outer:for(int i =(int) Math.ceil(c); i <= Math.floor(cc); i++) {
			
			for(int j = (int)Math.ceil(d); j <= Math.floor(dd); j++) {
				if(i == j) {
					System.out.println(i);
					flag = false;
					break Outer;
				}
				
			}
			
		}
		
		if(flag) {
			
		System.out.println("-1");
		}
		
		

	}

}
