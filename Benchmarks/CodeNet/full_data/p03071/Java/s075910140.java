import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    
    int count = 0;
    
    // 判定&計算
    if(num1 > num2) {
      if(num1 - num2 >= 2) {
        count = num1;
        num1 -= 1;
        count += num1;
      }else{
        count = num1 + num2;
      }
    }else if(num2 > num1){
      if(num2 - num1 >= 2) {
        count = num2;
        num2 -= 1;
        count += num2;
      }else{
        count = num1 + num2;
      }
    }else{
      count = num1 + num2;
    }
      
    // 出力  
    System.out.println(count);
   }
 }