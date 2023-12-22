//最初のよくわからん呪文
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//入力変数
int H = sc.nextInt();
int W = sc.nextInt();
int D = sc.nextInt();
int num[][] = new int[H][W];
for(int i=0;i<H;i++){
   for(int j=0;j<W;j++){
      num[i][j] = sc.nextInt();
   }
}
int Q = sc.nextInt();
int L[] = new int[Q];
int R[] = new int[Q];
for(int q=0;q<Q;q++){
   L[q] = sc.nextInt();
   R[q] = sc.nextInt();
}

//変換:数値→座標
int pos[][] = new int[H*W+10][2];
for(int k = 1;k<=H*W;k++){
   for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
        if(num[i][j] == k){  
           pos[k][0] = i;
           pos[k][1] = j;
       }
     }
   }
}

//出力変数
int ans[] = new int[Q];

//計算のための変数
int start=0,goal=0;

//計算
for(int q=0;q<Q;q++){
   //ｑの関わる変数の初期化
   ans[q] = 0;
   start = L[q];
   goal = start + D;

   for(; start != R[q];){ 
   ans[q] += Math.abs(pos[start][0]-pos[goal][0])+Math.abs(pos[start][1]-pos[goal][1]);
   start = start + D;
   goal = goal + D;
   }
}

//出力
for(int q=0;q<Q;q++){
   System.out.println(ans[q]);
}

}
}
