import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    String str1 = null;
    String str2 = null;
    int x = 0;

    for(int i = 0;i < n;i++) {
      s[i] = sc.next();
    }

    for(int i = 0;i < n-1;i++) {

      for(int j = i+1;j < n;j++) {
        if(s[i].equals(s[j])) {
          x = 1;
          break;
        }
      }

      str1 = s[i].substring(s[i].length()-1,s[i].length());
      str2 = s[i+1].substring(0,1);

      if(str1.compareTo(str2) != 0) {
        x = 1;
      }

      if(x == 1) break;

    }

    if(x == 1) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }

}
