import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();
    int ans = 0;
    for(int i = 0;i <= K;i++){
      if(i < S){
        ans += S - i + 1;
      }
    }
    System.out.println(ans);

  }
}
