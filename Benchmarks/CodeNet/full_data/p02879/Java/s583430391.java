package traning;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if((x>=1&&x<=9)&&(y>=1&&y<=9)){
			System.out.print(x*y);
		}else{
			System.out.print(-1);
		}
	}
}