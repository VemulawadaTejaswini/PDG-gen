import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;
    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        for (int c = 1; c <= n; c++) {
          sum += _gcd(_gcd(a, b), c);
        }
      }
    }
    System.out.println(sum);
    }



  private static int _gcd (int a, int b) {
	int temp;
	while((temp = a % b) != 0) {
		a = b;
		b = temp;
  }
	return b;
  }
}
