import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    if(A == 0) {
      System.out.println(0);
    }else{
      System.out.println(N - B);
    }
  }
}
