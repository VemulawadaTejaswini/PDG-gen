import java.util.Scanner;
public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();

      System.out.println(n%2 == 1 ? n/2+1 : n/2);
    }
}