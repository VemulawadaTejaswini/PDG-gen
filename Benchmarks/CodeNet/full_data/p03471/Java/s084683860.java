import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Y = scn.nextInt()/1000;
		boolean can = false;
		for(int i = 0;i < N && !can;i++) {
			for(int j = 0;j < N-i;j++) {
				int k = N-i-j;
				if(10*i + 5*j + k == Y) {
					can = true;
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		if(!can)System.out.println(-1 + " " + -1 + " " + -1);
	}

}
