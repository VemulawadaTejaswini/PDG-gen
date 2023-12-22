import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long K =sc.nextLong();
    int N =sc.nextInt();
    long A[] =new long[N];
    long B[] =new long[N];
    long C =0;int D=0;
    A[0]=sc.nextLong();
    for(int i=1;i<N;i++){
      A[i]=sc.nextLong();
      B[i]=A[i]-A[i-1];
      C =Math.max(C,B[i]);
      if(C==B[i]){D = i;}}
    B[0] =N-A[N-1]+A[0];
    C =Math.max(C,B[0]);
    if(C==B[0]){D=0;}
    System.out.println(K-B[D]);
  }
}
