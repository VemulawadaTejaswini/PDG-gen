public class Main {
  public static void main(String[] args) {
    boolean flag = (Integer.parseInt(args[0]) % 2 == 0) || (Integer.parseInt(args[0]) % 2 == 0);
    String out = flag ? "Even" : "Odd";
    System.out.print(out);
  }
}
