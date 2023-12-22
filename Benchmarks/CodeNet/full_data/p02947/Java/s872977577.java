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
      long sum = 0;
      for(int i=0;i<n-1;i++) {
        if (s[i].equals(s[i+1])) {
          sum++;
          cnt+=sum;
        } else {
          sum=0;
        }
      }
      System.out.println(cnt);
    }
}
