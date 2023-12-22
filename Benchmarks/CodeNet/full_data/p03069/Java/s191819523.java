import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String s = stdIn.next();
    int cnt = 0;

    for(int i=1; i<n; i++) {
      char a = s.charAt(i-1);
      char b = s.charAt(i);
      if(a == '#' && b == '.') {
        cnt += 1;
      }
    }

    System.out.println(cnt);
  }
}