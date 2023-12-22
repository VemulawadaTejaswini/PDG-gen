import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.nextLine();
    String S = scan.nextLine();
    int K = scan.nextInt();

    char notReplaceChar = S.charAt(K - 1);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < S.length(); i++) {
      char check = S.charAt(i);
      if(check == notReplaceChar) {
        sb.append(check);
      } else {
        sb.append('*');
      }
    }
    System.out.println(sb.toString());
  }
}
