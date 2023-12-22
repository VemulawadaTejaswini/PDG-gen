import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Main{
  public static void main(String[] args)throws ParseException{
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
    Date d = f.parse(s);
    Date dh = f.parse("2019/04/30");
    if(d.getTime() > dh.getTime()){
      System.out.println("TBD");
    }else{
      System.out.println("Heisei");
    }
  }
}
