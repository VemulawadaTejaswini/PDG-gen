import java.util.Scanner;
class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    int sum = 0;
    
    for(int i=0;i<M;i++){
      int a = sc.nextInt();
      sum += a;
    }
    if(sum<=N){
      System.out.println(N-sum);
    }else{
      System.out.println(-1);
    }
  }
}