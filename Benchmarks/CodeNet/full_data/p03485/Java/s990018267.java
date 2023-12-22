import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      //aの入力を受け取る
      int a = sc.nextInt();
      
      //bの入力を受け取る
      int b = sc.nextInt();
      
      //aとbの平均を出し、少数を切り上げる
      System.out.print(Math.round(a / b));
    }
}