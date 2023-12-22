import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int array[] = new int[3];
		int number = 0;
		int max = 0;
		int exe1 = 0;
		int exe2 = 0;
		int answer = 0;
		//これから3つの数字の最大値を検索する関数を作る
		//1,配列作成、配列の初期化
		for(int i = 0;i < 3;i++){
			array[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		//2,三つのうち最大の数字を取得
		kesu:for(int i = 0;i < 3;i++){
		number = 0;
		for(int n = 0;n < 3;n++){
			if(array[i] >= array[n]){
				number++;
				if(number == 3){
					max = array[i];
					if(i == 0){
						exe1 = array[1];
						exe2 = array[2];
					}else if(i == 1){
						exe1 = array[0];
						exe2 = array[2];
					}else if(i == 2){
						exe1 = array[0];
						exe2 = array[1];
					}


															break kesu;
				}
			}
		}

		}
		for(int i = 0;i < a;i++){
		max = max * 2;
		}
		answer = max + exe1 + exe2;


		System.out.println(answer);
		
		
	
	}
}
