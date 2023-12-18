public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    String relation;
    if (a < b) {
        relation = "<";
    } else if (a > b) {
        relation = ">";
    } else {
        relation = "==";
    }
    System.out.printf("a %s b\n", relation);
  }
}
