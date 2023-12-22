import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();

    char cur = s.charAt(0);
    int ans = 0;
    int change = 0;
    for (int i = 1; i < n; ++i) {
      if (cur == s.charAt(i)) {
        ++ans;
      } else {
        cur = s.charAt(i);
        ++change;
      }
    }

    if (change == 1) {
      ++ans;
    } else if (change != 0) {
      int count = 0;
      int i = 0;
      int j = n - 1;
      while (count < k) {
        int left = i++;
        int right = j--;
  
        while (i < n && s.charAt(left) == s.charAt(i)) ++i;
        while (j >= 0 && s.charAt(right) == s.charAt(j)) --j;
  
        if (i <= j) {
          ans += 2;
        } else {
          break;
        }
        ++count;
      }  
    }
    
    System.out.println(ans);

    sc.close(); 
  }
}
