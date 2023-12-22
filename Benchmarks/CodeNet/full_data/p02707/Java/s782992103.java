import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int A[] =new int[N];
    int B[] =new int[N];
    for(int j=0;j<N;j++){
      B[j]=0;}
    for(int i=0;i<N-1;i++){
      A[i]=sc.nextInt();
      B[A[i]-1]=B[A[i]-1]+1;}
    for(int k=0;k<N;k++){
      System.out.println(B[k]);}
  }
}