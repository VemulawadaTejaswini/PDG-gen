	import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int n  = Integer.parseInt(t[0]);
			long k = Long.parseLong(t[1].replaceAll("\\.", ""));


			StringBuilder sb = new StringBuilder();

			long x  = k == 100 ? 101 : k;
			sb.append(x);

			switch(n) {
				case 1:{
					sb.append("00");
					break;
				}
				case 2:{
					sb.append("0000");
					break;
				}
			}
			System.out.println(sb.toString());
		}
	}