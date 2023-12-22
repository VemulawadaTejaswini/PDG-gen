import java.util.Scanner;
import java.lang.StringBuilder;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String s = stdIn.next();
    int cnt1 = 0;
    int cnt2 = 0;
    int cnt = 0;


    StringBuilder str1 = new StringBuilder(s);
    for(int i=1; i<n; i++) {
      char a = str1.charAt(i-1);
      char b = str1.charAt(i);
      if(a == '#' && b == '.') {
        cnt1 += 1;
        str1.setCharAt(i,'#');
      }
    }

    StringBuilder str2 = new StringBuilder(s);
    for(int i=0; i<n-1; i++) {
      char a = str2.charAt(i);
      if(a == '#') {
        cnt2 += 1;
        str2.setCharAt(i,'.');
      }
    }

    if(cnt1 < cnt2) {
      cnt = cnt1;
    }else {
      cnt = cnt2;
    }

    System.out.println(cnt);
  }
}