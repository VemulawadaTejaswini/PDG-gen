import java.util.Scanner;

public class Main{
  static int N;
  static int K;
  static int A[];
  static int DP[];
  static int DPK[];
  static int ans;
  public static void main(String args[]){
    int ans = 100000000;
   Scanner sc = new Scanner(System.in);
   N = sc.nextInt();
   K = sc.nextInt();
   A = new int[N];
   DP = new int[N];
   DPK = new int[N];
   for(int i=0;i<N;i++){
     A[i]=sc.nextInt();
   }
   DP[0]=0;
   DP[1]=Math.abs(A[0]-A[1]);
   if(N==2){
     System.put.println(DP[1]);
   }
   else{
   for(int i=2;i<N;i++){
     for(int j=i-1;j>i-K-1;j--){
       if(j<0){}
         else{
           DPK[j]=DP[j]+Math.abs(A[j]-A[i]);
           if(ans>=DPK[j]){
             ans=DPK[j];
           }
         }
     }
     DP[i]=ans;
     ans = 100000000;
   }
   System.out.println(DP[N-1]);
 }
}

}
