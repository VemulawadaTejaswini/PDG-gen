import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long H =sc.nextLong();
    if(H==1){System.out.println(1);}
    else{
    long M[]=new long[100000];
    long N[]=new long[100000];
    M[0]=H;N[0]=1;int k=0;
    for(int i=1;i<100;i++){
      M[i]=(M[i-1]-M[i-1]%2)/2;
      N[i]=2*N[i-1];
      k=k+1;
    if(M[i]==1){break;}}
    long x=0;
    for(int j=0;j<=k;j++){
      x=x+N[j];}
    System.out.println(x);
  }}
}