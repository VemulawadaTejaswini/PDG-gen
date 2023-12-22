import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();
    int ans = 0;
    for(int i = 0;i <= K;i++){
      for(int j = 0;j <= K;j++){
        for(int k = 0;k <= K;k++){
          if(S == i + j + k){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);

  }
}
