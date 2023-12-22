import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		// スペース区切りの整数の入力
		int B = sc.nextInt();
		int C = sc.nextInt();
		//
    if (C >= A && C <= B) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
		
	}
}