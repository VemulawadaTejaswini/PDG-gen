import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int answer = 0;
    if (s.equals("SUN")){
      answer = 7;
    } else if (s.equals("MON")){
      answer = 6;
    } else if (s.equals("TUE")){
      answer = 5;
    } else if (s.equals("WED")){
      answer = 4;
    } else if (s.equals("THU")){
      answer = 3;
    } else if (s.equals("FRI")){
      answer = 2;
    } else if (s.equals("SAT")){
      answer =1;
    }
    System.out.println(answer);
  }
}