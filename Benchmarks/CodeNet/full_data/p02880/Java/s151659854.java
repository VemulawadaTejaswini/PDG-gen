import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean yes = false;
    int num = sc.nextInt();
    for (int i=1; i<10; i++) {
      for (int j=i; j<10; j++) {
        if (num == i*j) {
          System.out.println("Yes");
          yes = true;
          sc.close();
          break;
        }
      }
    }
    if (yes == false) {
      System.out.println("No");
      sc.close();
    }
  }
}
