import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int count = 0;
    while(N >= K){
      N = N / K;
      count += 1;
    }
    System.out.println(count + 1);
  }
}