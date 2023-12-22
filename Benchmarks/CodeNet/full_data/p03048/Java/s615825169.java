import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int r= sc.nextInt();
		int g= sc.nextInt();
		int b= sc.nextInt();
		int n = sc.nextInt();
		

		int r_c = n/r;
		int count = 0;
		for(int a = 0; a<=r_c; a++) {
			int n_minus_r = n - a*r;
			
			int g_c = n_minus_r/g;
			for(int c = 0; c<=g_c;c++) {
				int n_minus_rg = n_minus_r - g*c;
				if (n_minus_rg % b == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}