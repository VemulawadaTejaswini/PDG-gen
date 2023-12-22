import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int ans = 0;
    if(str.equals("SUN")){
      ans = 7;
    }else if(str.equals("MON")){
      ans = 6;
    }else if(str.equals("TUE")){
      ans = 5;
    }else if(str.equals("WED")){
      ans = 4;
    }else if(str.equals("THU")){
      ans = 3;
    }else if(str.equals("FRI")){
      ans = 2;
    }else if(str.equals("SAT")){
      ans = 1;
    }
    System.out.println(ans);
  }
}
    
    