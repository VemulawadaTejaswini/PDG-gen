import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    int tap = 1;

    while(tap < B){
      tap += A - 1;
      ans++;
    }
    System.out.print(ans);
  }
}
