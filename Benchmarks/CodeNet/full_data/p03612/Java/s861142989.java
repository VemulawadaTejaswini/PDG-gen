import java.util.*;

public class Main {
  public static void main(String[] args) {
 	Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[scanner.nextInt()];
    for (int ix = 0; ix < numbers.length; ix++) {
       numbers[ix] = scanner.nextInt();
    }
	
    int swaps = 0;
    for (int ix = 0; ix < numbers.length; ix++) {
      if (numbers[ix] == x) {
        swaps++;
		if (ix < numbers.length - 1) {
          int temp = numbers[ix];
          numbers[ix] = numbers[ix + 1];
          numbers[ix + 1] = temp;
        } else if (ix >= 0) {
          int temp = numbers[ix];
          numbers[ix] = numbers[ix - 1];
          numbers[ix - 1] = temp;
        }
      }
    }
    
	System.out.println(swaps);
  }
}