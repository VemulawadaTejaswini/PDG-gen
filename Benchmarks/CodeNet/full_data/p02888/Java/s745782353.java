import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] lens = new int[n];
      for(int i = 0; i < n; i++)
        lens[i] = sc.nextInt();
      Arrays.sort(lens);
      int cnt = 0;
      for(int i = n - 1; i >= 2; i--) {
        int left = 0, right = i - 1;
        while(left < right) {
          if(lens[left] + lens[right] > lens[i]) {
            cnt += right - left;
            right--;
            continue;
          }
          left++;
        }
      }
      System.out.println(cnt);
  }
}