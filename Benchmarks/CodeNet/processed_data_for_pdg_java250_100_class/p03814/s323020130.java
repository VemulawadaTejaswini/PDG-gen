public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    Pattern p = Pattern.compile("^[^A]*(A.*Z)[^Z]*$");
    Matcher m = p.matcher(a);
    if (m.find()) {
      System.out.println(m.group(1).length());
    }
  }
}
