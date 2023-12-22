import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    	int N,x,y;
	    Scanner sc = new Scanner(System.in);  //標準入力の宣言
      	N = sc.nextInt(); //入力数
    
        x = 800*N;
        y = 200*N/15;
    
        System.out.println(x-y);  //答えの確認

  }
}
