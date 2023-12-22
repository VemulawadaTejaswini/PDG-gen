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
int[] x=new int[N];
for(int i=0;i<N;i++){
    x[i]=1000000001;
}

//出力変数
String ans="Yes";

//計算

for(int i=0;i<M;i++){
  if(x[L[i]-1]==1000000001&&x[R[i]-1]==1000000001){
    x[L[i]-1]=0;
    x[R[i]-1]=D[i];
  }
  if(x[L[i]-1]==1000000001&&x[R[i]-1]!=1000000001){
    x[L[i]-1]=x[R[i]-1]-D[i];
  }
  if(x[L[i]-1]!=1000000001&&x[R[i]-1]==1000000001){
    x[R[i]-1]=x[L[i]-1]+D[i];
  }
  if(x[L[i]-1]!=1000000001&&x[R[i]-1]!=1000000001){
    if(x[R[i]-1]-x[L[i]-1]!=D[i]){
        ans="No";
    }
  }
}


//出力
System.out.println(ans);

}}