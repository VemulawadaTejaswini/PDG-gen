import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
		for(int i = 1;i <= 1000;i++){
          if(a == (int)(i * 0.08) && b == (int)(i * 0.1)){
            System.out.println(i);
            return;
          }
        }
      System.out.println(-1);
    }
}