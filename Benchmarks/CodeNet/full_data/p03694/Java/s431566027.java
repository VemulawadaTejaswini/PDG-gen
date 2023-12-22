import java.util.Scanner;
 
public class Main {
  void run() {
    Scanner sc = new Scanner(System.in);

    int min = 1000;
    int max = 0;
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      min = Math.min(min, a);
      max = Math.max(max, a);
    }
    System.out.println(max - min);
  }

  public static void main(String[] args) {
    new Main().run();
  }
}
