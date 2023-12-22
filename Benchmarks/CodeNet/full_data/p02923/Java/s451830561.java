import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int ans = 0;
    int count = 0;
    int now = Integer.parseInt(sc.next());
    for(int i = 1; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n <= now){
        count++;
        now = n;
      }else{
        count = 0;
        now = n;
      }
      ans = count > ans ? count : ans;
    }
    System.out.println(ans);
  }
}