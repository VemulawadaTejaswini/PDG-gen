import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int num = Integer.parseInt(sc.next());
    String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    String line = sc.next();
    for(int i = 0; i < 7; i++){
      if(line.equals(week[i])){
        System.out.println(7-i);
        break;
      }
    }
  }
}