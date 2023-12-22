import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a= sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double s = 2*Math.sqrt(a)*Math.sqrt(b);
		if(s+a+b< c) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	
			
	}
}
			
