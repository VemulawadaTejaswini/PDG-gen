import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// 出力
      if(a%3 == 0){
		System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}