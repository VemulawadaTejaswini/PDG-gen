import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] A=new int[N+1];
    for(int i=1;i<N+1;i++){
      A[i]=scan.nextInt();
    }
    int[] ans=new int[N+1];
    for(int i=1;i<N+1;i++){
      ans[A[i]]=i;
    }
    for(int i=1;i<N+1;i++){
      System.out.print(ans[i]+" ");
    }   
  }
}