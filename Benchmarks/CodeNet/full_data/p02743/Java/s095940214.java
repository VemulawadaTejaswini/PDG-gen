import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a= sc.nextLong();
		Long b = sc.nextLong();
		Long c = sc.nextLong();
		Long t = a*b;
		double s = 2*Math.sqrt(t);
		if(s < c-a-b) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	
			
	}
}
			