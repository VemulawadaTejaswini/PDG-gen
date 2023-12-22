public class Main {

  public static void main(String[] args) {
    String result = "War";
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int X = scanner.nextInt();
    int Y = scanner.nextInt();

    int xMax = -100;
    int yMin = 100;
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      if ( x > xMax ) {
        xMax = x;
      }
    }
    for (int i = 0; i < M; i++) {
      int y = scanner.nextInt();
      if ( yMin > y) {
        yMin = y;
      }
    }

    for (int Z = X + 1; Z <= Y; Z++) {
      if (xMax < Z && Z <= yMin) {
        result = "No War";
        break;
      }
    }

    System.out.println(result);
  }

}
