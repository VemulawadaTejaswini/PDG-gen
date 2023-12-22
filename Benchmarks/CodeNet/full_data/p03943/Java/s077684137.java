import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
      
        if (x + y == z || x == y + z || x + z == y) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
 
      
		// 戻り値の返却
		//System.out.println(x + y + z);
	
	} 
}