import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner bui = new Scanner(System.in);
		
		int N = bui.nextInt();
		float sum = 0;
		for(int i=0;i<N;i++) {
			String f = bui.next();
			String s = bui.next();
			if(s.equals("JPY")) {
				sum += Integer.parseInt(f);
			}else {
				sum += Float.parseFloat(f)*380000.0f;
			}
		}
		
		System.out.println(sum);
		
		
	}
}