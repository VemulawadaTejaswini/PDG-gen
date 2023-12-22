import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String t = sc.next();
    if(t.equals("xxx")){
      System.out.print(700);
    }else if(t.equals("oxx")||t.equals("xox")||t.equals("xxo")){
      System.out.print(800);
    }else if(t.equals("oox")||t.equals("oxo")||t.equals("xoo")){
      System.out.print(900);
    }else{
      System.out.print(1000);
    }
  }
  

  
}
