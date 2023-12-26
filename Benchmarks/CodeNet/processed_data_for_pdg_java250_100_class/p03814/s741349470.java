public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int ans = str.lastIndexOf('Z') - str.indexOf('A') + 1;
    System.out.println(ans);
  }
}
