import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    String S = scanner.next();
    int first = N;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == '#') {
        first = i;
        break;
      }
    }
    int ans = 0;
    for (int i = first; i < N; i++) {
      if (S.charAt(i) == '.') {
        ans++;
      }
    }
    System.out.println(ans);
  }

}
