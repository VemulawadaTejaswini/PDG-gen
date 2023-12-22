import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] bar = new int[N];
    int sum = 0;
    for(int i=0; i<N; i++){
      bar[i] = sc.nextInt();
      sum += bar[i];
    }
    int ans = Integer.MAX_VALUE;
    int temp = 0;
    for(int i=0; i<N-1; i++){
      int temp += bar[i];
      ans = Math.min(ans, Math.abs(sum - temp - temp));
    }
    System.out.print(ans);
  }
}