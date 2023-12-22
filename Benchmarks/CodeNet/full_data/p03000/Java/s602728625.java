import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int a = 0;
    int b = 0;
    while((a <= X)&(b < N+1)){
      a += sc.nextInt();
      b += 1;
    }
    System.out.println(b);
  }
}