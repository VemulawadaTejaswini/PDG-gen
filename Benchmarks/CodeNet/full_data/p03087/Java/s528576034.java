import java.util.*;
 
class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];
    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }
    int[] ans = new int[q];
    for (int i = 0; i < q; i++) {
      String temp = s.substring(l[i] -1, r[i]);
      while (true) {
        int index = temp.indexOf("AC");
        if (index == -1) {
          System.out.println(ans[i]);
          break;
        }
        ans[i]++;
        temp = temp.substring(index + 2);
      }
      
    }
  }
}