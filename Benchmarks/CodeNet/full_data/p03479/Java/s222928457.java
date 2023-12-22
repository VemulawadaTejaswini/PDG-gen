import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long X = scanner.nextLong();
    long Y = scanner.nextLong();
    long sum = X;
    int count = 1;
    while(true){
      if (sum > Y){break;}
      X *= 2;
      sum += X;
      count++;
    }
    System.out.println(count);
  }
}
