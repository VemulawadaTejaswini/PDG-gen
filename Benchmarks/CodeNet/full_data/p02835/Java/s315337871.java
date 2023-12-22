import java.util.*;
 
	public static void main() {
      Scanner sc = new Scanner(System.in);
		// 整数の入力
      int A1 = sc.nextInt();
      int A2 = sc.nextInt();
      int A3 = sc.nextInt();
      int sum = A1 + A2 + A3;
      if(sum<=21){
        System.out.println("win");
      }else{
        System.out.println("bust");
      }
    }