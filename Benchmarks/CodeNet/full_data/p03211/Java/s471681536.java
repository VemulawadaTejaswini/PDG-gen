import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		String snum = Integer.toString(s);
		String[] num = snum.split("");
		int dmin = 0;
		String S = "";
		int sum = 0,d = 0;
		for(int i = 0;i < snum.length() - 2;i ++) {
			S = "";
			sum = 0; d = 0;
			S = (num[i]+num[i+1]+num[i+2]);
			sum = Integer.parseInt(S);
			d = Math.abs(sum - 753);
			if(i == 0) dmin = d;
			else {
				if(dmin > d) dmin = d;
			}
		}
		System.out.println(dmin);
	}
}