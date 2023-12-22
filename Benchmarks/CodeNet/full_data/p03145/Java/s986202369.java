import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int max = A;
    int B = sc.nextInt();
    max = Math.max(max,B);
    int C = sc.nextInt();
    max = Math.max(max,C);
    int area = (A + B + C - max) / 2;
    System.out.println(area);
  }
}