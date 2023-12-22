import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();


      System.out.println(repeat("x",n));
    }
  public static String repeat(String str, int n) {
  return String.join("", Collections.nCopies(n, str));
  }
}