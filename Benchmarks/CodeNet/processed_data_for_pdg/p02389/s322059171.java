public class Main {
  public static void main(String[] args ){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = x*y;
    int w = 2*x + 2*y;
    System.out.printf("%d %d\n",z,w);
  }
}
