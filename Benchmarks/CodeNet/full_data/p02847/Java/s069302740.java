import java.util.*;

class Main {
  public static void main(String args[]) {
    
    HashMap<String, Integer> weeks = new HashMap<String, Integer>();
    weeks.put("SUN", 7);
    weeks.put("MON", 6);
    weeks.put("TUE", 5);
    weeks.put("WED", 4);
    weeks.put("THU", 3);
    weeks.put("FRI", 2);
    weeks.put("SAT", 1);
    
    Scanner scanner = new Scanner(System.in);
    String today = scanner.next();
    System.out.println(weeks.get(today));
  }
}