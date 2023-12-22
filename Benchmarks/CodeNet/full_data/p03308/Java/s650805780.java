import java.util.*;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int[] numbers = new int[num];
  for (int i = 0; i < num; i++) {
   numbers[i] = sc.nextInt();
  }
  Arrays.sort(numbers);
  System.out.println(Math.abs(numbers[0] - numbers[num-1]));
 }
}