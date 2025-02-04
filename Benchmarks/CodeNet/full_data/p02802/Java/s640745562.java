
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =Integer.parseInt(sc.next());
		int m =Integer.parseInt(sc.next());
		
		int [][]ac = new int [n][2];
		boolean []flag = new boolean [n];
		
		for(int i = 0 ;i < m ;i++) {
			int p = Integer.parseInt(sc.next());
			String s = sc.next();
			if(s.equals("AC")) {
				flag[p-1] = true;
				ac[p-1][1] = 1;
			}
			else if(s.equals("WA") && !flag[p-1]) {
				ac[p-1][0]++;
			}
		}
		
		long ans1 = 0;
		long ans2 = 0;
		
		for(int i = 0 ;i < n ;i++) {
			ans1 += (long)ac[i][1];
			ans2 += (long)ac[i][0];
		}
		
		System.out.println(ans1+" "+ans2);
	
	}

}
