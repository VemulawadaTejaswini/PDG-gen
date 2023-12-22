import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		String s = sd.next();
		
		int a = Integer.parseInt(s);
		
		int p = 0;
		
		while(Math.pow(p, 2)<=a) {
			p++;
		}
		
		System.out.println(Math.pow(p, 2));
		
		
	}
	
	
}