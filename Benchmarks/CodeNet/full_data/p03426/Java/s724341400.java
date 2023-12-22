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
int pos[][] = new int[H*W][2];
   for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
           pos[num[i][j]-1][0] = i;
           pos[num[i][j]-1][1] = j;
       }
     }

//座標→距離
int len[] = new int[H*W];
for(int k = 0;k<H*W;k++){
if(k/D ==0){
len[k]=0;
}else{
len[k] = len[k-D] +Math.abs(pos[k][0]-pos[k-D][0])+Math.abs(pos[k][1]-pos[k-D][1]);
}
}

//出力変数
int ans[] = new int[Q];

//計算
for(int q=0;q<Q;q++){
   //ｑの関わる変数の初期化
   ans[q] = len[R[q]-1]-len[L[q]-1];
  }

//出力
for(int q=0;q<Q;q++){
   System.out.println(ans[q]);
}

}
}
