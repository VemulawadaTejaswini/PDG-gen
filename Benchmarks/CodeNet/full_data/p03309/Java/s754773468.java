import java.util.*;

public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int[] numbers = new int[num];
  for (int i = 0; i < num; i++) {
   numbers[i] = sc.nextInt();
  }

  boolean positive = (calcSorrow(numbers, 0) - calcSorrow(numbers, -1)) < 0;
  int b = 0;
  int lastSorrow = 0;
  if (positive) {
   lastSorrow = calcSorrow(numbers, b);
   while (calcSorrow(numbers, b) > lastSorrow) {
    lastSorrow = calcSorrow(numbers, b);
    System.out.println(lastSorrow);
    b++;
   }
  } else {
   lastSorrow = calcSorrow(numbers, b);
   while (calcSorrow(numbers, b) > lastSorrow) {
    lastSorrow = calcSorrow(numbers, b);
    System.out.println(lastSorrow);
    b--;
   } 
  }
  System.out.println(lastSorrow);
 }

 private static int calcSorrow(int[] numbers, int b) {
  int kanashimi = 0;
  for (int i = 0; i < numbers.length; i++) {
   kanashimi += Math.abs(numbers[i] - b - i - 1);
  }
  return kanashimi;
 }
}