import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    String[] h = scanner.nextLine().split(" ");
    
    int total = 1;
    int max = Integer.parseInt(h[0]);
    for (int i = 1; i < Integer.parseInt(n); i++) {
      if (max <= Integer.parseInt(h[i])) {
        max = Integer.parseInt(h[i]);
        total++;
      }
    }
    System.out.println(total);
  }
}