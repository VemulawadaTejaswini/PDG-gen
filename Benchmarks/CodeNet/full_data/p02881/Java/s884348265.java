import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    long ans = N-1;
    for (long i = 2; i*i <= N ; i++) {
      if(N%i==0){
        ans = Math.min(ans,i-1+N/i-1);
      }
    }

    System.out.println(ans);
  }

}