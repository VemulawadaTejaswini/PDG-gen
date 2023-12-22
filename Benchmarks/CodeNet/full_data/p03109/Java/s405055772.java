import java.util.*;
import java.text.*;
 
public class Main{
  public static void main(String args[]) {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
    Date heisei = f.parse("2019/04/30");
    Date d = f.parse(args[0]);
    if(d.after(heisei)) {
      System.out.println("TBD");
    }
    else {
      System.out.println("Heisei");
    }
  }
}