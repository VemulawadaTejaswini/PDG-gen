import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string = sc.next();

    String first = string.substring(0, 2);
    String second = string.substring(2, 4);
    boolean f = isMonth(first);
    boolean s = isMonth(second);
    
    String ans = null;
    if (f && !s) {
      ans = "MMYY";
    } else if (!f && s) {
      ans = "YYMM";
    } else if (f && s){
      ans = "AMBIGUOUS";
    } else {
      ans = "NA";
    }
    
    System.out.println(ans);
  }
  
  private static boolean isMonth(String string) {
    String[] month = {
      "01", "02", "03", "04", "05", "06", 
      "07", "08", "09", "10", "11", "12"
    };
    for (int i = 0; i < month.length; i++) {
      if (month[i].equals(string)) {
        return true;
      }
    }
    return false;
  }
}