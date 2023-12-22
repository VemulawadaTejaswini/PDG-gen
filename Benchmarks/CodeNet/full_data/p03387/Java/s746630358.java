import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int[] num = {A, B, C};
    int count = 0;

    Arrays.sort(num); //num[0]が最小で、num[1]が真ん中、num[2]が最大
    if((num[2] - num[0]) % 2 == 0 && (num[2] - num[1]) % 2 == 0){
      count = num[2] - (num[0]+num[1])/2;
    }
    if((num[2] - num[0]) % 2 == 1 && (num[2] - num[1]) % 2 == 1){
      count = num[2] - (num[0]+num[1])/2;
    }
    if((num[2] - num[0]) % 2 == 0 && (num[2] - num[1]) % 2 == 1){
      count = 1 + (2 * num[2] - num[0] - num[1] + 1)/2;
    }
    if((num[2] - num[0]) % 2 == 1 && (num[2] - num[1]) % 2 == 0){
      count = 1 + (2 * num[2] - num[0] - num[1] + 1)/2;
    }
    System.out.println(count);
  }
}