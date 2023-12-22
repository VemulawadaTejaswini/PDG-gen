import java.util.*;
public class Main{
  public static long mod=100000007;
  public static long Hoku(long a, long b){
    long k=a;
    for(int i=0;i<b-1;i++){
      k=k*a%mod;}
    return k;
  }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N=sc.nextInt();
    int K =sc.nextInt();
    long P[]=new long[K+1];
    long x=0;;
    for(int i=K;i>0;i--){
      long j=K/i;
       P[i]=Hoku(j,N);
      for(int l=2;l<=j;l++){
        P[i]=(mod+P[i]-P[i*l])%mod;}
      x=(x+i*P[i])%mod;}
    System.out.println(x);
  }
}