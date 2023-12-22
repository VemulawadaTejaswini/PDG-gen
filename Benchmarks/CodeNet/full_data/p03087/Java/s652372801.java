import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Q = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		int[] num = new int[N+1];
		for(int i = 0;i < N;i++) {
			char ch = str[i];
			if(ch == 'A' || ch == 'T' || ch == 'C' || ch == 'G') {
		    	num[i+1] = num[i] + 1;
		    }else {
		    	num[i+1] = num[i];
		    }
		}
		for(int i = 0;i < Q;i++) {
			int l = scn.nextInt();
			int r = scn.nextInt();
			System.out.println(num[r] - num[l-1]);
		}
	}

}
