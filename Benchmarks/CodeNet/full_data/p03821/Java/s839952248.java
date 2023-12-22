import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			//ボタンを押す数
			int count = 0;
			//はじめの数を決定
			int a = sc.nextInt();
			int[][] s = new int[2][a];
			//入力から受け取った値を格納
			//ここで受け取った値を格納
			for(int i=0;i<s.length;i=i+1){
				for(int j=0;j<2;j++){
					s[i][j]= sc.nextInt();
				}
			}
			int t= s.length;
			while(0 < t){
				while(s[0][a]/s[1][a] == 0){
					s[0][a]=s[0][a]+1;
					count = count+1;
				}
				t = t-1;
			}
			System.out.println(count);
	}
}