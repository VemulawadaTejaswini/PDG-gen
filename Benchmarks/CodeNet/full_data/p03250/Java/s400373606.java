import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    // "AB+C" → (10 * A) + B + C → (9 * A) + (A + B + C)とし、
    // Aが3つの数値のうち最大値となるようにする
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int max = 0;
    for (int i = 0; i < 3; i++) {
      int num = sc.nextInt();
      sum += num;
      if (num > max) {
        max = num;
      }
    }
    sum += max * (10 - 1);
	System.out.println(sum);
  }
}