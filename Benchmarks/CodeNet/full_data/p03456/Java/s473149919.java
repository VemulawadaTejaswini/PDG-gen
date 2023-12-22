import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		String s = "" + a + b;
		int sn = Integer.valueOf(s);
		double sq = Math.sqrt(sn);
		int  sqi = (int) sq; 
		
		if (sn == sqi*sqi) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}