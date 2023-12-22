import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		if(n == 0) {
			System.out.println("0");
		}
		else {
			String s = "";
			int c = 0;
			while(true){
				long pow = 2L << c;
				if(n % pow != 0) {
					n -= Math.pow(-2, c);
					s = "1" + s;
				}
				else {
					s = "0" + s;
				}
				if(n == 0)
					break;
				c++;
			}
			
			System.out.println(s);
		}
	}
		

}
