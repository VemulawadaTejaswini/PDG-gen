import java.util.Scanner;

public class Main {
  static final long INF = Long.MAX_VALUE / 2;
  static int a, b, c;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();

    long S = a * b;
    long ans = INF;

    if(c > 1){
      if(c % 2 == 0){
        ans = 0;
      }
      else{
        ans = Math.min(ans, Math.abs((c / 2) * S - (c - c / 2) * S));
      }
    }

    S = b * c;
    if(a > 1){
      if(a % 2 == 0){
        ans = 0;
      }
      else{
        ans = Math.min(ans, Math.abs((a / 2) * S - (a - a / 2) * S));
      }
    }

    S = a * c;
    if(b > 1){
      if(b % 2 == 0){
        ans = 0;
      }
      else{
        ans = Math.min(ans, Math.abs((b / 2) * S - (b - b / 2) * S));
      }
    }

    System.out.println(ans);
  }
}