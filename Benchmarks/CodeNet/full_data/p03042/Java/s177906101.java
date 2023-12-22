import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String former = s.substring(0,2);
    String latter = s.substring(2,4);
    int formerInt = Integer.parseInt(former);
    int latterInt = Integer.parseInt(latter);
    
    if(formerInt == 0){
      if(latterInt == 0 || latterInt > 12){
        System.out.println("NA");
      } else {
        System.out.println("YYMM");
      }
    }
    
    if(formerInt >0 && formerInt <= 12){
      if(latterInt == 0 || latterInt > 12){
        System.out.println("MMYY");
      }else{
        System.out.println("AMBIGUOUS");
      }
    }
    
    if(formerInt >12){
      if(0<latterInt && latterInt<=12){
        System.out.println("YYMM");
      }else{
        System.out.println("NA");
      }
    }
  }
}