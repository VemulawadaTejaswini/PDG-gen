import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();

  	int max = A;

  	if (max < B) {
      max = B;
    }
    if (max < C) {
      max = C;
    }
    System.out.println(A + B + C + max * ((1 << K) - 1));
  }

}
