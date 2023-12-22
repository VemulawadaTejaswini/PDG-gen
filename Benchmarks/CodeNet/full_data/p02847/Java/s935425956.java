import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int ans = 0;
    if(str = "SUN"){
      ans = 7;
    }else if(str = "MON"){
      ans = 6;
    }else if(str = "TUE"){
      ans = 5;
    }else if(str = "WED"){
      ans = 4;
    }else if(str = "THU"){
      ans = 3;
    }else if(str = "FRI"){
      ans = 2;
    }else if(str = "SAT"){
      ans = 1;
    }
    System.out.println(ans);
  }
}
    
    