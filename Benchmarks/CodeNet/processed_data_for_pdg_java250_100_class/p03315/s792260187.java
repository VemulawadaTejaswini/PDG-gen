public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String sPlus = S.replace("-", "");
    System.out.println(2 * sPlus.length() - 4);
  }
}
