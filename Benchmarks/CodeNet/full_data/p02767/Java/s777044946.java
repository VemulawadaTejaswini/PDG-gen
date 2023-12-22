import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N+1];
    B[0] =0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[i+1]=B[i]+A[i];}
    double C =B[N]/N;
    int D =(int) C;
    int x=D;int y=0;
    if(C>D+0.5){x=x+1;}
    for(int j=0;j<N;j++){
      y=y+(A[j]-x)*(A[j]-x);}
    System.out.println(y);
  }
}