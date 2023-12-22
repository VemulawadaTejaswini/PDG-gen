import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    HashMap<String, String> h = new HashMap<String, String>();
    h.put("SUN", "日曜日");
    h.put("MON", "月曜日");
    h.put("TUE", "火曜日");
    h.put("WED", "水曜日");
    h.put("THU", "木曜日");
    h.put("FRI", "金曜日");
    h.put("SAT", "土曜日");
    System.out.println(h.get(s));
  }
}
