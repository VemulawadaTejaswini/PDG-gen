import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int ans = 0;
    for (int p = 0; p <= A; p++){
      for (int q = 0; q <= B; q++){
        for (int r = 0; r <= C; r++){
          int total = 500*p + 100*q + 50*r;
          if (total == X) ans++;
        }
      }
    }
    System.out.println(ans);
  }
}