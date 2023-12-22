import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String s = stdIn.next();
    int cnt1 = 0;
    int cnt2 = 0;
    int cnt = 0;

    for(int i=1; i<n; i++) {
      char a = s.charAt(i-1);
      char b = s.charAt(i);
      if(a == '#' && b == '.') {
        cnt1 += 1;
      }
    }

    for(int i=1; i<n; i++) {
      char a = s.charAt(i);
      if(a == '#') {
        cnt2 += 1;
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