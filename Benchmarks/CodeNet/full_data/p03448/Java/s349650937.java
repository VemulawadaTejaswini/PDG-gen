public class Main {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    
    int x = scanner.nextInt();
    
    int sum = 0;
    int count = 0;
    for (int i = 0; i <= a; i++) {
      for(int j = 0; j <= b; j++) {
        for(int k = 0; k <= b; k++) {
          sum = 500 * i + 100 * j + 50 * k;
          if (sum == x ) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}