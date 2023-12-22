import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int[] cnt = new int[3];
      for(char c : s.toCharArray())
        cnt[c-'a']++;
      if(s.length() <= 3) {
         boolean flag = true;
         for(int i = 0; i < 3; i++)
            if(cnt[i] > 1) {
                flag = false;
                break;
            }
         if(flag) {
             System.out.println("YES");
             return;
         }
      }
      Arrays.sort(cnt);
      if(cnt[0] != cnt[1] && cnt[1] != cnt[2]) {
        System.out.println("NO");
        return;
      }
      if(cnt[0] == cnt[1]) {
        if(cnt[0]*2 >= cnt[2]) {
          System.out.println("YES");
          return;
        }
      }
      if(cnt[2] == cnt[1]) {
         if(cnt[2] == cnt[0] || cnt[2] == cnt[0]+1) {
            System.out.println("YES");
            return;
         }
      }
      System.out.println("NO");
  }
}