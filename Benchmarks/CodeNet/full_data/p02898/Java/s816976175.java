//第 4 問: ABC 087 B - Coinsi (200 点)
/*
 * dreamererasereraserdream
erasereraserdream
reraserdream
NO
 */

import java.util.Scanner;


public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		scan.nextLine();

		int count =0;

		//List<Integer> list = new ArrayList<Integer>();

		for (int i=0; i<N; i++) {

		   int hi =	scan.nextInt();

		   if (hi >= K) {
			   ++count;
		   }
		}

		System.out.println(count);

	}
}

