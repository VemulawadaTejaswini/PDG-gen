import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int i = 0;
    do{
      i++;
      int ans = (a * i) % b;
      if(ans == c) {
        System.out.println("YES");
        return;
      }
    }while((a * i) % b != 0);
    System.out.println("NO");
  }
}
