import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int gcd (int a, int b) {
      int temp;
      while((temp = a%b)!=0) {
        a = b;
        b = temp;
      }
      return b;
    }
    public static void main(String[] args) {
      int N = sc.nextInt();
      int answer = 0;
      int x = 0; int y = 0;
      for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
          for(int k = 1; k <= N; k++){
            x = gcd(i,j);
            y = gcd(x,k);
            answer += y;
          }
        }
      }
      System.out.println(answer);
      }
}