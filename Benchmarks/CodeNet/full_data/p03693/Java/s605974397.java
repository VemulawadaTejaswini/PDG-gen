package atcoder064A;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = R * 100 + G * 10 + B;
		if(N % 4 == 0) System.out.println("YES");
		else System.out.println("NO");
	}


}
