import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,M;
		N = sc.nextInt();
		M = sc.nextInt();
		int x,y;
		x=1;
		y =1;
		for (int i=0;i<N;i++) {
			x=x*2;
		}
		for (int i=0;i<M;i++) {
			y=y*2;
		}
		x--;
		y--;
		StringBuffer sb = new StringBuffer(y);
		for (int j =0;j<y;j++) {
			sb.append("1");
		}
		StringBuffer sbx = new StringBuffer(y);
		for (int j =0;j<y;j++) {
			sbx.append("0");
		}
		for (int i =0;i<x;i++) {
			if (i%2 ==0) {
				System.out.println(sb);
			} else {
				System.out.println(sbx);
			}
		}
	}
}