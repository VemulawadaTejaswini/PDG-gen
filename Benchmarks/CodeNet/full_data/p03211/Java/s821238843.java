import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		String snum = String.valueOf(s);
		int dmin = 0;
		for(int i = 0;i < snum.length() - 2;i ++) {
			String S = "";
			int sum = 0,d = 0;
			S += String.valueOf(snum.charAt(i)) + String.valueOf(snum.charAt(i+1))
			    + String.valueOf(snum.charAt(i+2));
			sum = Integer.valueOf(S);
			d = Math.abs(sum - 753);
			if(i == 0) dmin = d;
			else {
				if(dmin > d) dmin = d;
			}
		}
		System.out.println(dmin);
	}
}