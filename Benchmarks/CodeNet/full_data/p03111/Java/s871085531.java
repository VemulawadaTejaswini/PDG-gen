import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3];for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
		int[] l = new int[n];for (int i = 0; i < n; i++) l[i] = sc.nextInt();
		int ans = Integer.MAX_VALUE; int res = 0; int sum = 0;
		String format = "%".concat(String.valueOf(n)).concat("s");
		String s = "";
		OUT:for (int i = 0; i < Math.pow(4, n); i++) {
			s = String.format(format, Integer.toString(i, 4)).replace(" ","0");
			res = 0;
			for (int j = 0; j < 3; j++) {
				sum = 0;
				for (int k = 0; k < s.length(); k++) {
					if((s.charAt(k)-'0')==j) {
						if(sum > 0) res += 10;
						sum += l[k];
					}
				}
				if(sum == 0) {
					continue OUT;
				}else {
					res += Math.abs(sum-a[j]);
				}
			}
			ans = Math.min(ans, res);
		}
		System.out.println(ans);
		sc.close();
	}
}