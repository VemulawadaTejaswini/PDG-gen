import java.util.*;

public class Main {
	
    private static Integer count = 0;
      
	public static void main(String[] args) {

		// argumentの取得
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
      
        if (x == 1) {
          //System.out.println(0);
          return;
        }
      
        if ((x % 2) == 0) {
         //System.out.println(x + " は偶数");
         System.out.println(x/2);
        } else {
         //System.out.println(x + " は奇数");
         System.out.println((x-1)/2);
        }
	} 
}