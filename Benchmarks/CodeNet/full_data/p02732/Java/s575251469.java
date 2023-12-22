import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    long A[] =new long[N];
    long B[] =new long[N];
    long C[] =new long[N+1];
    long D[] =new long[N];
    long W[] =new long[N];
    C[0]=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
      B[A[i]-1]=B[A[i]-1]+1;}
    int X=0;
    for(int x=0;x<N;x++){
      if(!(B[x]==0)){X=X+1;}}
    for(int j=0;j<N;j++){
      if(!(D[A[j]-1]==0)){C[j+1]=C[j];continue;}
       D[A[j]-1]=B[A[j]-1]*(B[A[j]-1]-1)/2;
       C[j+1]=C[j]+D[A[j]-1];}
        for(int k=0;k<N;k++){
           W[k]=C[N]-D[A[k]-1]+(B[A[k]-1]-1)*(B[A[k]-1]-2)/2;
      System.out.println(W[k]);}
  }
}
