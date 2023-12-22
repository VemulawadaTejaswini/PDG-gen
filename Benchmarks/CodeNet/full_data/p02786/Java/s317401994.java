import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    long num = scan.nextLong();

    long count = 0;

    for(long i = num; i > 0; i /= 2){
      count += i;
    }

    System.out.println(count);
  }
}