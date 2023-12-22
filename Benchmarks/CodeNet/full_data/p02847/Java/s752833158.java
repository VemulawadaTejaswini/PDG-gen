import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String[] day = {"SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};

    for(int i = 0; i < 7; i++){
      if(s.equals(day[i])){
        System.out.println(i + 1);
        break;
      }
    }
  }
}
