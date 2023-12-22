import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int[] num = new int[c.length];
		for(int n = 0; n < c.length;n++) {
			num[n] = c[n] - '0';
		}
		String[] e = new String[3];
		for(int h = 0; h <3; h++) {
			e[h] = "+";
		}
		for(int i = 0; i <= 1; i++) {
			int sum = num[0];
			if(i == 1) {
				sum -= num[1];
				e[0] = "-";
			}
			else {
				sum += num[1];
				e[0] = "+";
			}
			for(int j = 0; j <= 1; j++) {
				if(j == 1) {
					sum -= num[2];
					e[1] = "-";
				}
				else {
					sum+= num[2];
					e[1] = "+";
				}
				for(int k = 0; k <= 1; k++) {
					if(k == 1) {
						sum -= num[3];
						e[2] ="-";
					}
					else {
						sum+=num[3];
						e[2] = "+";
					}
					if(sum==7) {
						System.out.println(num[0] + e[0]+num[1]+e[1]+num[2]+e[2]+num[3]+"=7");
						return;
					}
					sum += num[3]*-1;
				}
				 sum += num[2]*-1;
			}
			sum += num[1]*-1;
		}
	}
}
