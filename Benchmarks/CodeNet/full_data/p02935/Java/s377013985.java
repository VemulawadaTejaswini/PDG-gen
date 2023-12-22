
import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] v = sc.nextLine().split(" ");

		intN = Integer.parseInt(n);

		int min1=1001; //一番小さい
		int min2=1001; //2番目に小さい
		double result = 0;
		for (int i = 0;i < v.length; i++) {
			int tempV = Integer.parseInt(v[i]);
			if ( tempV < min1) {
				min2=min1;
				min1=tempV;
			} else if (tempV < min2) {
				min2=tempV;
			}
			result = result + tempV;

		}
		result = (result * 2 - min1 - min2 ) / 2;
		System.out.println(result);
	}
}