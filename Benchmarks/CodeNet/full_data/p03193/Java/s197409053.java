import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int H=scan.nextInt();
    int W=scan.nextInt();
    int[] A=new int[N];
    int[] B=new int[N];
    int count=0;
    for(int i=0;i<N;i++){
      A[i]=scan.nextInt();
      B[i]=scan.nextInt();
      if(A[i]>=H&&B[i]>=W){
        count++;
      }
    }
    System.out.println(count);
  }
}