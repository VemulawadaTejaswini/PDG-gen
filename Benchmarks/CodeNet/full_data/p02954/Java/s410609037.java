import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int[] a = new int[n];
    ArrayList<Integer> list = new ArrayList<Integer>();
    int[] ans = new int[n];
    list.add(0);
    for(int i = 0; i < n - 1; i++) {
      if(s.charAt(i) == 'R') {
        
      } else {
        a[i] = 1;
      }
      if(s.charAt(i) != s.charAt(i + 1)) list.add(i + 1);
    }
    list.add(n);
    int[] b = new int[n];
    for(int i = 0; i < list.size() - 1; i++) {
      for(int j = list.get(i); j < list.get(i + 1); j++) {
        if((i % 2) == 0) {
          b[j] = list.get(i + 1);
        } else {
          b[j] = list.get(i) - 1;
        }
      }
    }
    for(int i = 0; i < n; i++) {
      if(a[i] == 0) {
        int t = b[i] - i;
        if((t % 2) == 0) {
          ans[b[i]]++;
        } else {
          ans[b[i] - 1]++;
        }
      } else {
        int t = i - b[i];
        if((t % 2) == 0) {
          ans[b[i]]++;
        } else {
          ans[b[i] + 1]++;
        }        
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(ans[i]);
    }
  }
}
