import java.util.Scanner;
public class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int cnt = 0;
    while(N>0){
      N /= K;
      cnt++;
    }
    System.out.println(cnt);
  }
}
