import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.close();

    long sum = 0;
    for(int i=0; i<N; i++) {
      if(i%3 != 0 && i%5 != 0) {
        sum += (long)i;
      }
    }

    System.out.println(sum);
  }
}