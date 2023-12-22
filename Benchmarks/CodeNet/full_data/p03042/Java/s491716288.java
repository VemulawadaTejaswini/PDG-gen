import java.util.*;

public class Main { 
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  String p = sc.next();
      int first = Integer.parseInt(p.substring(0,2));
      int second = Integer.parseInt(p.substring(2));
      
      boolean ff =0 < first&& first <= 12;
      boolean sf = 0 < second&&second <= 12;
 
      if (ff&&sf) {
        System.out.println("AMBIGUOUS");
    } else if (ff&&!sf) {
        System.out.println("MMYY");
    } else if (!ff&&sf) {
        System.out.println("YYMM");
     } else {
     System.out.println("NA");
      }
    }
}