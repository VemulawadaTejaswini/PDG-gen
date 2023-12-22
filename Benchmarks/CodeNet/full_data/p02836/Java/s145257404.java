

import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int l = 0;
    int r = s.length()-1;
    int ans = 0;
    while(l<r) {
      if(s.charAt(l)!=s.charAt(r)) ans++;
      l++;
      r--;
    }
    System.out.println(ans);
  }

}
