import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	    Scanner sc = new Scanner(System.in);  //標準入力の宣言

		int A = sc.nextInt();  //標準入力をAに代入
		int B = sc.nextInt();  //標準入力をBに代入
		int C = sc.nextInt();  //標準入力をCに代入
        int N;  //答えを代入する変数
		
        if (A-B <= C) {
          N = C-(A-B);
        } else {
                  N = 0;
               }

        System.out.println(N);

  }
}