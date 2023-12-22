import java.util.*;
import java.io.PrintWriter;
public class Main{
  public static long mod=1000000007;
  public static long Hoku(long a, long b){
    if(b==0){return 1;}
    else if(b%2==0){
      long k =Hoku(a,b/2);
      return k*k%mod;}
    else{long t=Hoku(a,b-1);
         return t*a%mod;}
  }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N=sc.nextInt();
    int K =sc.nextInt();
    sc.close();
    long P[]=new long[K+1];
    long x=0;;
    for(int i=K;i>0;i--){
      long j=K/i;
       P[i]=Hoku(j,N);
      for(int l=2;l<=j;l++){
        P[i]=P[i]-P[i*l];}
      x=(x+i*P[i])%mod;}
    System.out.println(x);
  }
}