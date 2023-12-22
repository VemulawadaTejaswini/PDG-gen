import java.util.*;
class Black
  public static void Main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    
    int sum = num1 + num2 + num3;
    
    if(sum < 22){
      System.out.println("win");
    }else(sum > 21){
      System.out.println("bust");
    }
  }
}