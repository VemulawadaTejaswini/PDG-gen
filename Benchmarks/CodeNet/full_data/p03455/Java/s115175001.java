import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    int[] array = new int[2];
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    while(scanner.hasNext() && scanner.hasNextInt() && i < array.length) {
      array[i] = scanner.nextInt();
      i++;
    }
    
    if(array[0] * array[1] % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}