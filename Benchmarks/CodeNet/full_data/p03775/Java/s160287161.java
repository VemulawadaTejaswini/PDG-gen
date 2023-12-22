import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    final long n = sc.nextLong();
    for( long i = (int) Math.sqrt(n);i<=n;i++){
      if (n%i == 0){
        System.out.println(Long.toString(i).length());
        return ;
      }
    }
  }
}