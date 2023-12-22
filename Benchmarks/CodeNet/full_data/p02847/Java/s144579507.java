import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    String[] days = new String[]{"-1", "SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
    Scanner sc = new Scanner(System.in);
    String day = sc.next();
    for (int i = 0; i < days.length; i++) {
      if (days[i].equals(day)) System.out.println(i);
    }
  }
}

