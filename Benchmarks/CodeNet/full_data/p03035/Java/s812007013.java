import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int fee = 0;

    if(a >= 13){
      fee = b;
    }else if(a >= 6){
      fee = b / 2;
    }else if(a < 5){
      fee = 0;
    }

    System.out.print(fee);
    }
}