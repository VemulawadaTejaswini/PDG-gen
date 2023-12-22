import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String week = sc.next();
    
    if(week.equals("SUN")){
      System.out.println(7);
    }else if(week.equals("MON")){
      System.out.println(6);
    }else if(week.equals("TUE")){
      System.out.println(5);
    }else if(week.equals("WED")){
      System.out.println(4);
    }else if(week.equals("THU")){
      System.out.println(3);
    }else if(week.equals("FRI")){
      System.out.println(2);
    }else if(week.equals("SAT")){
      System.out.println(1);
    }else{}
  }
}
