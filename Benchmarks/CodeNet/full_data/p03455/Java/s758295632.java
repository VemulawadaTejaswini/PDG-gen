import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    //入力受付
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int ab = a * b;
    
    
    //判定
    if(ab % 2 == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
  	}
}