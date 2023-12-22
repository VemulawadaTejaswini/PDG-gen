import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    double sum = 0;
    for(int i=1; i<=N; i++){
      int ans = i;
      int cnt = 0;
      while(ans<K){
        ans *= 2;
        cnt++;
      }
      sum += Math.pow(0.5, cnt)/N;
    }
    System.out.println(sum);
  }
}
                                    
    
