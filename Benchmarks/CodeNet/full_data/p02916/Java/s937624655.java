import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int A[] =new int[N+1];
    int B[] =new int[N+1];
    int C[] =new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();}
    A[N]=0;
    B[0]=0;
    for(int j=1;j<N+1;j++){
      B[j]=B[j-1]+sc.nextInt();}
    int x=B[N];
    for(int k=0;k<N;k++){
      C[k]=sc.nextInt();
      if(A[k+1]==A[k]+1){x=x+C[k];}}
    System.out.println(x);
  }
}