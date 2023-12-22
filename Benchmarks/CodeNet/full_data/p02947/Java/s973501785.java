import java.util.*;
 
public class Main {
  static int[] list;
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] s = new String[n];
      for (int i = 0; i<n;i++) {
        char[] chars = sc.next().toCharArray();
        Arrays.sort(chars);
        s[i] = String.valueOf(chars);
      }
      Arrays.sort(s);
      long cnt = 0;
      long cnt1 = 0;
      for(int i=0;i<n;i++) {
        for (int j = i; j < n; j++) {
          if (s[i].equals(s[j])) {
            cnt1++;
          } else {
            i = j-1;
            break;
          }
        }
        if (cnt1 > 0) {
          cnt += cnt1 * (cnt1 - 1) / 2;
          cnt1 = 0;
        }
      }
      System.out.println(cnt);
    }
}
