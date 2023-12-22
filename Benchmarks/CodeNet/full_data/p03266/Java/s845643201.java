import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int k = sc.nextInt();
      boolean isOdd = (k % 2 == 1);
      if(isOdd) {
        long cnt = 0;
        for(int i = 1; i <= N; i++)
          if(i % k == 0) cnt++;
        System.out.println(cnt * cnt * cnt);
        return;
      } else {
        long cntZore = 0;
        long cntK = 0;
        for(int i = 1; i <= N; i++) {
          if(i % k == 0) cntZore++;
          else if(i % k == k / 2) cntK++;
        }
        System.out.println(cntZore * cntZore * cntZore + cntK * cntK * cntK);
        return;
      }
  }
}