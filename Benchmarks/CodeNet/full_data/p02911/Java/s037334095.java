import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int K=scan.nextInt();
    int Q=scan.nextInt();
    int[] A=new int[Q];
    int[] porson=new int[N];
    for(int i=0;i<Q;i++){
      A[i]=scan.nextInt();
    }
    for(int i=0;i<N;i++){
      porson[i]=K;
    }
    for(int i=0;i<Q;i++){
      for(int j=0;j<N;j++){
        int tmp=A[i]-1;
        if(tmp!=j){
          porson[j]-=1;
       }
      }
   }
    for(int i=0;i<N;i++){
      if(porson[i]>0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}