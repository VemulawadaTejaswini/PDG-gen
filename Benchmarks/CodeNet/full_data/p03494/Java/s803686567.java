import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int[] numbers = new int[number];
    for (int i = 0; i < number; i++) {
      numbers[i] = sc.nextInt();
    }
    int[] count = new int[number];
    for (int j = 0; j < number; j++) {
      while(numbers[j] % 2 == 0) {
        numbers[j] /= 2;
        count[j]++;
        }
      }
    Arrays.sort(count);
    System.out.println(count[0]);
    
  }
}