import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    long sum = 0;

    for (int i = 1; i <= n; i++) {
      if ((i%3==0)||(i%5==0)) {
         
      } else {
        sum += i;
      }
    }

    System.out.println(sum);

  }

}