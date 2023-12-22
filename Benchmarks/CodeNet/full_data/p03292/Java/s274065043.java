import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
       	int c = sc.nextInt();
	
		int i = Math.abs(c-a);
      	int j = Math.abs(c-b); 
 
		// 出力
		System.out.println(i+j);
	}
}