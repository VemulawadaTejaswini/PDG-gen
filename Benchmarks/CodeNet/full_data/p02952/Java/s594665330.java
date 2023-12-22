import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int inputOrder = String.valueOf(n).length();
    Boolean isEven = false;
    if (inputOrder % 2 == 0) {
      isEven = true;
    }
    
    int numberOfOddOrder = 0;
    int numberOfOddOrder2 = 9;
    int numberOfOddOrder4 = 99;
    int numberOfOddOrder6 = 999;
    if (isEven) {
      switch (inputOrder) {
        case 2:
          numberOfOddOrder = numberOfOddOrder2;
          break;
        case 4:
          numberOfOddOrder = numberOfOddOrder4;
          break;
        case 6:
          numberOfOddOrder = numberOfOddOrder6;
          break;
      }
    } else {
      switch (inputOrder) {
        case 1:
          numberOfOddOrder = n;
          break;
        case 3:
          numberOfOddOrder = numberOfOddOrder2 + (n - 100 + 1);
          break;
        case 5:
          numberOfOddOrder = numberOfOddOrder2 + numberOfOddOrder4 + (n - 10000 + 1);
          break;
      }
    }
    
    System.out.println(numberOfOddOrder);
  }
  
}