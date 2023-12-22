public class Yakiniku {
  public static void main(String args[]) {
    Scanner cin = new Scanner(System.in);
    String numString = cin.nextLine();

    String s = cin.nextLine();
    if ("YAKI".equals(s.substring(0, 4))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
