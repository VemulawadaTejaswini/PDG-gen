import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int taka = sc.nextInt();
    int flag1 = 0;
    int flag2 = 0;
    
    if(taka < 1200){
      System.out.print("ABC");
      flag1 = 1;
    }else if(taka < 2800){
      System.out.print("ARC");
      flag2 = 1;
    }
    
    if(flag1 == 0 && flag2 == 0){
      System.out.print("AGC");
    }
  }
}