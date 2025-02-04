import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] K = new int[N];
    int ans = Integer.MAX_VALUE;
    for(int i=0; i<N; i++){
      K[i] = sc.nextInt();
    }
    for(int i=1; i<=100; i++){
      int sum = 0;
      for(int j=0; i<N; j++){
        sum += (K[j]-i)*(K[j]-i);
      }
      ans = Math.min(ans, sum);
    }
    System.out.print(ans);
  }
}
    
       
    
