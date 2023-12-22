import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int A[] =new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();}
    int ans =0;
    for(int j=0;j<N;j++){
      if(A[A[j]-1]==j){ans =ans+1;}}
    System.out.println(ans/2);
  }
}
