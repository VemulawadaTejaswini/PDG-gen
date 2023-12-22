import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    long B[] =new long[N];
    long C[] =new long[N];
    long D[] =new long[N];
    long E[] =new long[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();B[i]=0;C[i]=0;D[i]=0;}
    if(N%2==0){
      long x=0; long y=0;
      for(int j=0;j<N/2;j++){
        x=x+A[2*j]; y=y+A[2*j+1];}
      long c =Math.max(x,y);
      System.out.println(c);}
    else if(N%2==1){
      for(int l=0;l<N-1;l++){
        if(l==0){
          for(int p=0;p<=(N-3)/2;p++){
            B[0]=B[0]+A[2+2*p];}
          E[0]=B[0];}
        else if(l%2==0){
          for(int q=0;q<l/2;q++){
            C[l]=C[l]+A[2*q];D[l]=D[l]+A[2*q+1];}
          B[l]=B[l]+Math.max(C[l],D[l]);
          for(int m=0;m<=(N-l-3)/2;m++){
            B[l]=B[l]+A[l+2+2*m];}
          E[l]=Math.max(B[l],E[l-1]);}
        else{
          for(int n=0;n<=(l-1)/2;n++){
            B[l]=B[l]+A[2*n];}
          for(int v=0;v<(N-l-2)/2;v++){
            C[l]=C[l]+A[l+2+2*v];
            D[l]=D[l]+A[l+2+2*v+1];}
          B[l]=B[l]+Math.max(C[l],D[l]);
         E[l]= Math.max(B[l],E[l-1]);}}
      System.out.println(E[N-2]);
    }
  }
}