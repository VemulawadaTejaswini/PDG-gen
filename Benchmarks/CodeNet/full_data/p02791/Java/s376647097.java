import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int max = 0;
    int min = 100000000;
    int ans = 0;
    for(int i = 0; i < N; i++){
      int M = Integer.parseInt(sc.next());
      if(M > max){
        max = M;
      }
      if(M <= min){
        min = M;
        ans++;
      }
    }
    System.out.println(ans);
  }
}