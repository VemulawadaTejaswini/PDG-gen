import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		if(x * 2 <= a * a * b) {
			
			double ans =Math.toDegrees(Math.atan2(b * b * a, x * 2));
			System.out.println(ans);
		}
		
		else {
			double X = Math.pow(a, 3);
			double Y = ((a* a * b) - x) * 2; 
			
			
			double ans =Math.toDegrees(Math.atan2(Y, X));
			System.out.println(ans);
		}
	}

}
