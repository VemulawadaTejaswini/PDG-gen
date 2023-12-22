/*
 *　026 - B
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int query;
		int start = 0;
		int buy = 0;
		int check = 0;
		int plus = 0;
		String result;

		//クエリ数の二次元配列を用意
		query = scan.nextInt();
		int[][] element = new int[query][4];

		for(int i = 0 ; i < query; i++){
			for(int j = 0; j < 4; j++) {
				element[i][j] = scan.nextInt();
			}

			start = element[i][0];
			buy   = element[i][1];
			check = element[i][2];
			plus  = element[i][3];


		}

		for(int i = 0 ; i < query; i++){
			result = Comp_Num.Comp1(start,buy,check,plus);
			System.out.println(result);
		}
	}

}

//比較用のクラス
class Comp_Num{

	static String Comp1(int s, int b, int c, int p){

		int first	= s;
		int before = s;
		int present;

		int start	= s;
		int buy		= b;
		int check	= c;
		int plus	= p;

		for(;;){

			if(start < buy) {

				return "no";

			}else {

				start = start - buy;

				if(start <= check) {

					start = start + plus;

				}
			}

			if(first == start) {
				return "yes";
			}

		}

	}



}

