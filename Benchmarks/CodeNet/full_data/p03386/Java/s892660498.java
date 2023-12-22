import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long A = scanner.nextInt();
    long B = scanner.nextInt();
    long K = scanner.nextInt();

      if (A + K > B - K){
        for (long i = A; i <= B; i++)
          System.out.println(i);
        }
      if (A + K <= B - K){
        for (long i = A; i < A + K; i++)
          System.out.println(i);
        for (long i = B - K + 1; i <= B; i++)
          System.out.println(i);
      }
  }
}