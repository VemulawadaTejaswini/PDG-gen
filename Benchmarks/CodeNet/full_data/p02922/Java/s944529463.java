import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    // b=1の場合(aプラグ必要なし)
    if(b==1) {
      System.out.println(0);
      System.exit(0);
    }
    // a>bの場合(aプラグが1つ必要)
    if(a>b) {
      System.out.println(1);
      System.exit(0);
    }

    // b>=2の場合(aプラグがn個必要)
    int ans = 1; // 最後のプラグ分を事前に加算
    b += -a;      // 最後のプラグは、穴がa個空いている
    --a;          // 最後のプラグ以外は、穴がa-1空いている
    if(b%a == 0)
      ans += b/a;
    else
      ans += b/a+1;

    System.out.println(ans);
  }
}