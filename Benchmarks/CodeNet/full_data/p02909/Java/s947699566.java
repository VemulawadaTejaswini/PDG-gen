import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		String x = s.next();
        if (x.equals("Sunny")) {
          System.out.println("Cloudy");
        } else if (x.equals("Cloudy")) {
          System.out.println("Rainy");
        } else {
          System.out.println("Sunny");
        }
      
		// 戻り値の返却
		//System.out.println(x);
	
	} 
}