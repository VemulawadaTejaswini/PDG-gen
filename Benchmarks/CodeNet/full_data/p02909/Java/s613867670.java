import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	//参加人数
		int n = sc.nextInt();
      	//初期ポイント
      	int k = sc.nextInt();
      	//回数
      	int q = sc.nextInt();
      	//勝敗判断
      	int count = 0;
		// 最初の持ち点を格納する
      	int[] point = new int[n];
        for(int i=0;i<point.length;++i){
            point[i] = k;
        }
      	//ゲーム
      	while(sc.hasNext()){
           //正解者
          int a = sc.nextInt();
          for(int i=0;i<point.length;++i){
          	if(a!=(i+1)){
             //正解者ではなかったらー１する
            	point[i]-=1;
         	 }
            if(point[i]<=0){
              count = 1;
            }
          }
            if(count == 0){
              System.out.println("Yes");
            }else{
              System.out.println("No");
            }
        }
    }
}