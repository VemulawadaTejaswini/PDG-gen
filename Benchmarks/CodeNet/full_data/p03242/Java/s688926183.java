public class AtCoderBeginner111 {
  public static void main(String[] args) {
    if (args == null) {
      return;
    }
    System.out.println(args[0].replace("1", "A").replace("9", "1").replace("A", "9"));
  }
}
