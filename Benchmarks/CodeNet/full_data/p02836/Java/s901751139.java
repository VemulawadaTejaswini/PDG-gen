public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder re = sb.reverse();
    int count = 0;
    for (int i = 0;i < sb.length();i++) {
      if (sb.charAt(i) != re.charAt(i)) {
        count++;
      }
    }
    System.out.pringln(count);
  }
}