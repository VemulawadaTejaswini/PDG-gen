public class Main {

  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int x = scanner.nextInt();
    int t = scanner.nextInt();
    System.out.println(Math.max(0, x - t));
  }
}