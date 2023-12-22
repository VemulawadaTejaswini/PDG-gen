import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N;
	static int[] T;
	static int pp,before,after;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 T = new int[N];

		 for(int i = 0 ; i < N ; i++){
			 T[i] = sc.nextInt();
		 }
		 sc.close();

		 //最大値と最小値の差の絶対値が小さいとは
		 //4分割したそれぞれの数列の和が、限りなく同じ(sum(Ai)/4ずつ)が望ましい
		 //e.g.
		 //10 71 84 33 6 47 23 25 52 64
		 //合計415(103 余り3)
		 //10 71(81)/84 33(117)/6 47 23 25(101)/52 64(116)
		 //117-81=36(最小値)

		 //各数字を代入した配列T[i]に対して、
		 //sum(T[N])/4-sum(T[i])とsum(T[N])/4-sum(T[i+1])を比較する。

		 //各製数列の和を格納する配列Uを定義
		 int[] U = new int[4];

		 //整数列T[N]の合計値/4(sum)を算出

		 int sum=0;
		 for(int i = 0 ; i < N ; i++){
			 sum += T[i];
		 }
		 sum = sum/4;

		 //配列ごとの比較
		 before = 0 ;
		 after = 0 ;
		 pp = 0;

		 //配列ひとつめ
		 for(int i = 0 ; i < N-3 ; i++){
			 before += T[i];
			 int babs = Math.abs(before-sum);
			// System.out.println(before);
			 after  = before + T[i+1];
			 int aabs = Math.abs(after-sum);
			// System.out.println(after);
			 if(babs>aabs){
				 //足す前のほうが大きい(sumから離れている)場合、繰上げ
				 if(i == N-4){
					 pp = i;
					 U[0] = before;
					 before = 0 ;
					 after = 0;
				 }else{
				 continue;
				 }
				 //回りきった場合は、総和を挿入する

			 }else{
				 pp = i;
				 U[0] = before;
				 before = 0 ;
				 after = 0;
				 break;

			 }
		 }

		 //配列ふたつめ
		 for(int i = pp+1 ; i < N-2 ; i++){
			 before += T[i];
			 int babs = Math.abs(before-sum);

			 after  = before + T[i+1];
			 int aabs = Math.abs(after-sum);

			 if(babs>aabs){
				 //足す前のほうが大きい(sumから離れている)場合、繰上げ
				 if(i == N-3){
					 pp = i;
					 U[1] = before;
					 before = 0 ;
					 after = 0;
				 }else{
				 continue;
				 }
				 //回りきった場合は、総和を挿入する
			 }else{
				 pp = i;
				 U[1] = before;
				 before = 0 ;
				 after = 0;
				 break;
			 }
		 }
		 //配列みっつめ
		 for(int i = pp+1 ; i < N-1 ; i++){

			 before += T[i];
			 int babs = Math.abs(before-sum);
			 after  = before + T[i+1];
			 int aabs = Math.abs(after-sum);
			 if(babs>aabs){
				 //足す前のほうが大きい(sumから離れている)場合、繰上げ
				 if(i == N-2){
					 pp = i;
					 U[2] = before;
					 before = 0 ;
					 after = 0;
				 }else{
				 continue;
				 }
				 //回りきった場合は、総和を挿入する
			 }else{
				 pp = i;
				 U[2] = before;
				 before = 0 ;
				 after = 0;
				 break;

			 }
		 }
		 //配列よっつめ
		 for(int i = pp+1 ; i < N ; i++){
			 U[3] += T[i];
		 }
/*
		 for(int i = 0 ; i < 4 ; i++){
			 System.out.println(U[i]);
		 }
*/

		 Arrays.sort(U);
		 System.out.println(U[3]-U[0]);
	}
}