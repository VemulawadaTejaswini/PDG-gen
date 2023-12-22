import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//入力変数
int N=sc.nextInt();
int M=sc.nextInt();
int[] L=new int[M];
int[] R=new int[M];
int[] D=new int[M];
for(int i=0;i<M;i++){
    L[i]=sc.nextInt();
    R[i]=sc.nextInt();
    D[i]=sc.nextInt();
}

//入力値変換
long[] x=new long[N];
for(int i=0;i<N;i++){
    x[i]=0;
}
boolean[] changed=new boolean[N];
for(int i=0;i<N;i++){
    changed[i]=false;
}

//出力変数
String ans="Yes";

//計算

for(int i=0;i<M;i++){
  if(!changed[L[i]-1]&&!changed[R[i]-1]){
    x[R[i]-1]=D[i];
  }else if(!changed[L[i]-1]&&changed[R[i]-1]){
    x[L[i]-1]=x[R[i]-1]-D[i];
  }else if(changed[L[i]-1]&&!changed[R[i]-1]){
    x[R[i]-1]=x[L[i]-1]+D[i];
  }else if(changed[L[i]-1]&&changed[R[i]-1]){
    if(x[R[i]-1]-x[L[i]-1]!=D[i]){
        ans="No";
    }
    changed[L[i]-1]=true;
    changed[R[i]-1]=true;
  }
}


//出力
System.out.println(ans);

}}