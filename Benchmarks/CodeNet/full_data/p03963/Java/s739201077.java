import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int num = k;
    
    for(int i = 0; i < n - 1; i++) {
      num = num * (k - 1);
    }
    System.out.println(num);
  }
}