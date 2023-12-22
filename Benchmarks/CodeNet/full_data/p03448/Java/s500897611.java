import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int count = 0;
    int a;
    int b;
    int c;
    int total;
    
    for (a = 0; a <= A; a++) {
      for (b = 0; b <= B; b++) {
        for (c = 0; c <= c; c++) {
          total = 500*a + 100*b + 50*c;
          if (total == X) count++;
        }
      }
    }
    System.out.println(count);
  }
}