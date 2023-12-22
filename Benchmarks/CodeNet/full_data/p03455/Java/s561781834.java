import java.util.*;

class Mail {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      // 入力チェックしたい
      int t = a * b;
      
      if (t % 2 == 0) {
        System.out.println("Even");
      } else {
        System.out.println("0dd");
      }
    }
}

積が奇数なら Odd と、 偶数なら Even と出力せよ。