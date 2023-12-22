import java.util.Scanner;

public class Main {
  public static int gcd(int x, int y) {
  	if (x % y == 0) {
      return y;
    }
    return gcd(y, x % y);
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = Integer.parseInt(input.nextLine());
    long sum = 0;
    
    // System.out.println(gcd(390, 273));
    
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        for (int k = 1; k <= num; k++) {
          sum += gcd(gcd(i,j),k);
        }
      }
    }
    
    System.out.print(sum);
  }
}