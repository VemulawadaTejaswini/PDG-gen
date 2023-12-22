import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		String x = s.next();
      
        switch (x) {
          case "SUN":
            System.out.println(7);
            return;
          case "MON":
            System.out.println(6);
            return;
          case "TUE":
            System.out.println(5);
            return;
          case "WED":
            System.out.println(4);
            return;       
          case "THU":
            System.out.println(3);
            return;
          case "FRI":
            System.out.println(2);
            return;
          case "SAT":
            System.out.println(1);
            return;  
        }
      
      
      
		// 戻り値の返却
		System.out.println(x);
	
	} 
}