import java.util.Scanner;


public class Main {
	static String S;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 S = sc.next();

		sc.close();
		int z = S.length()-1;

		String plus = "";
		int result = 0;
		long ans = 0;
		int tmp = 0 ;

		String [] pp = new String[9];

		for(int i = 1 ; i < Math.pow(2, S.length()-1) ; i++){
			String bin = Integer.toBinaryString(i);
			plus = String.format("%0"+z+"d", Integer.parseInt(bin));

	        for (int j = 0; j < plus.length(); j++) {
	            result = plus.indexOf("1", j);
	            if (result != -1) {
	                ans += Integer.parseInt(S.substring(j,result+1));
	                tmp = result;
	                j = result;
	            }
	        }

	        ans += Integer.parseInt(S.substring(tmp+1,S.length()));

		}
		ans += Long.parseLong(S);
		System.out.println(ans);

	}
}