import java.util.*;
public class Main{
	public static void main(String[] args){
		//N＋1個の箱
		//n+1個の左からの宛名0,1,....,Nとなる
		//現在位置X左右自由に移動可
		//宛名0とN(0<N<100)で終了
		//関所Ai(i = 1,2,.....,M(0<M<100)) == aの時1コスト
		//Ai と 0,X,Nは==でない
		//
		//nもしくは0に近い方にいく(0+N)/2>Amの時,
		//(0+N)/2<Amの時でxの位置確認
		//１、まずXの位置だす

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()+1;//箱
		int m = sc.nextInt();//関所の住所
		int x = sc.nextInt();//Xの位置と配列の誤差を消す
		int evalu[] = new int[m];
		int a[] = new int[m];
		int light = 0;
		int left = 0;
		for(int i = 0;i < m;i++){
			a[i] = sc.nextInt();//A1からAmゲット
		//１、まずXの位置だす
			if(a[i]>x){//Xの位置より右にいくつ料金所があるか算出

				light++;
			}else if(a[i]<x){//Xの位置より左にいくつ料金所があるか算出
				left++;
			}
		}
		//１、まずXの位置だす
		if (light == left){
			System.out.println(left);	
		}else if(light > left){
			System.out.println(left);
		}else if(light < left){
			System.out.println(light);
		}
	}
}
